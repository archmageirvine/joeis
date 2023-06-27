package irvine.oeis.a263;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A263948 Positive integers n such that (n+61)^3 - n^3 is a square.
 * @author Sean A. Irvine
 */
public class A263948 extends LinearRecurrence {

  /** Construct the sequence. */
  public A263948() {
    super(1, new long[] {1, -975, 975}, new long[] {244, 267607, 260678620});
  }
}
