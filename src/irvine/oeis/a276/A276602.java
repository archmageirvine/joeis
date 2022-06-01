package irvine.oeis.a276;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A276602 Values of k such that k^2 + 10 is a triangular number (A000217).
 * @author Sean A. Irvine
 */
public class A276602 extends LinearRecurrence {

  /** Construct the sequence. */
  public A276602() {
    super(new long[] {-1, 6}, new long[] {0, 9});
  }
}
