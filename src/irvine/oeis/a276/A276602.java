package irvine.oeis.a276;

import irvine.oeis.LinearRecurrence;

/**
 * A276602 Values of n such that <code>n^2 + 10</code> is a triangular number <code>(A000217)</code>.
 * @author Sean A. Irvine
 */
public class A276602 extends LinearRecurrence {

  /** Construct the sequence. */
  public A276602() {
    super(new long[] {-1, 6}, new long[] {0, 9});
  }
}
