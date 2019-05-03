package irvine.oeis.a276;

import irvine.oeis.LinearRecurrence;

/**
 * A276599 Values of n such that <code>n^2 + 5</code> is a triangular number <code>(A000217)</code>.
 * @author Sean A. Irvine
 */
public class A276599 extends LinearRecurrence {

  /** Construct the sequence. */
  public A276599() {
    super(new long[] {-1, 0, 6, 0}, new long[] {1, 4, 10, 25});
  }
}
