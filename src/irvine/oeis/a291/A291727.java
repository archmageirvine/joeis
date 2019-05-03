package irvine.oeis.a291;

import irvine.oeis.LinearRecurrence;

/**
 * A291727 p-INVERT of <code>(1,0,1,0,0,0,0,...)</code>, where <code>p(S) = (1 - S)^4</code>.
 * @author Sean A. Irvine
 */
public class A291727 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291727() {
    super(new long[] {-1, 0, -4, 4, -6, 12, -10, 12, -13, 8, -6, 4}, new long[] {4, 10, 24, 55, 116, 234, 460, 879, 1640, 3006, 5424, 9650});
  }
}
