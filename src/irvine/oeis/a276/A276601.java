package irvine.oeis.a276;

import irvine.oeis.LinearRecurrence;

/**
 * A276601 Values of n such that <code>n^2 + 9</code> is a triangular number (A000217).
 * @author Sean A. Irvine
 */
public class A276601 extends LinearRecurrence {

  /** Construct the sequence. */
  public A276601() {
    super(new long[] {-1, 0, 6, 0}, new long[] {1, 6, 12, 37});
  }
}
