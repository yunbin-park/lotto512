package com.androidapp.lotto512

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val cardName = findViewById<CardView>(R.id.cardName)
        cardName.setOnClickListener {
            startActivity(Intent(this, NameActivity::class.java))
        }
    }
}