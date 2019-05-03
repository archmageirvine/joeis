package irvine.oeis.a276;

import irvine.oeis.LinearRecurrence;

/**
 * A276598 Values of n such that <code>n^2 + 3</code> is a triangular number <code>(A000217)</code>.
 * @author Sean A. Irvine
 */
public class A276598 extends LinearRecurrence {

  /** Construct the sequence. */
  public A276598() {
    super(new long[] {-1, 6}, new long[] {0, 5});
  }
}
