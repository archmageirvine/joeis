package irvine.oeis.a291;

import irvine.oeis.LinearRecurrence;

/**
 * A291255 p-INVERT of <code>(0,1,0,1,0,1,...)</code>, where <code>p(S) = (1 - S - 2 S^2)^2</code>.
 * @author Sean A. Irvine
 */
public class A291255 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291255() {
    super(new long[] {-1, -2, 7, 10, -16, -10, 7, 2}, new long[] {2, 7, 18, 55, 144, 404, 1060, 2853});
  }
}
