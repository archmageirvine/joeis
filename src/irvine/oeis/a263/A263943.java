package irvine.oeis.a263;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A263943 Positive integers n such that (n+21)^3 - n^3 is a square.
 * @author Sean A. Irvine
 */
public class A263943 extends LinearRecurrence {

  /** Construct the sequence. */
  public A263943() {
    super(1, new long[] {1, -1, -254, 254, 1}, new long[] {7, 119, 4564, 32900, 1161895});
  }
}
