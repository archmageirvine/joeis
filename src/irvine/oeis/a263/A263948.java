package irvine.oeis.a263;

import irvine.oeis.LinearRecurrence;

/**
 * A263948 Positive integers n such that (n+61)^3 - n^3 is a square.
 * @author Sean A. Irvine
 */
public class A263948 extends LinearRecurrence {

  /** Construct the sequence. */
  public A263948() {
    super(new long[] {1, -975, 975}, new long[] {244, 267607, 260678620});
  }
}
