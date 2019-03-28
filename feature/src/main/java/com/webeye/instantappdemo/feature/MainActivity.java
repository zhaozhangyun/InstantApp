package com.webeye.instantappdemo.feature;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Intent intent;
    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "call onCreate");
        intent = getIntent();
        setContentView(R.layout.activity_main_a);
    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.d(TAG, "call onResume " + intent.toString());
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "call onDestroy");
    }
}
