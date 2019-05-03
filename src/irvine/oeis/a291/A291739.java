package irvine.oeis.a291;

import irvine.oeis.LinearRecurrence;

/**
 * A291739 p-INVERT of <code>(1,0,1,0,0,0,0,...)</code>, where <code>p(S) = 1 - S^3 - S^6</code>.
 * @author Sean A. Irvine
 */
public class A291739 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291739() {
    super(new long[] {1, 0, 6, 0, 15, 0, 20, 0, 15, 1, 6, 3, 1, 3, 0, 1, 0, 0}, new long[] {0, 0, 1, 0, 3, 2, 3, 12, 4, 30, 27, 45, 108, 90, 260, 342, 498, 1115});
  }
}
