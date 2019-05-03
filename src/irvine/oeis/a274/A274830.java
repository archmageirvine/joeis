package irvine.oeis.a274;

import irvine.oeis.LinearRecurrence;

/**
 * A274830 Numbers n such that <code>7*n+1</code> is a triangular number <code>(A000217)</code>.
 * @author Sean A. Irvine
 */
public class A274830 extends LinearRecurrence {

  /** Construct the sequence. */
  public A274830() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {0, 2, 5, 11, 17});
  }
}
