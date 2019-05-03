package irvine.oeis.a291;

import irvine.oeis.LinearRecurrence;

/**
 * A291411 p-INVERT of <code>(1,1,0,0,0,0,...)</code>, where <code>p(S) = 1 - 2 S - S^2 + S^3</code>.
 * @author Sean A. Irvine
 */
public class A291411 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291411() {
    super(new long[] {-1, -3, -2, 1, 3, 2}, new long[] {2, 7, 21, 63, 189, 567});
  }
}
