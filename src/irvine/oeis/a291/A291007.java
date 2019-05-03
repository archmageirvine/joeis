package irvine.oeis.a291;

import irvine.oeis.LinearRecurrence;

/**
 * A291007 p-INVERT of <code>(1,1,1,1,1,...)</code>, where <code>p(S) = 1 - S - S^2 - S^3 - S^4 - S^5</code>.
 * @author Sean A. Irvine
 */
public class A291007 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291007() {
    super(new long[] {2, -7, 14, -13, 6}, new long[] {1, 3, 9, 27, 81});
  }
}
