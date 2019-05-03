package irvine.oeis.a291;

import irvine.oeis.LinearRecurrence;

/**
 * A291725 p-INVERT of <code>(1,0,1,0,0,0,0,...)</code>, where <code>p(S) = (1 - S)^2</code>.
 * @author Sean A. Irvine
 */
public class A291725 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291725() {
    super(new long[] {-1, 0, -2, 2, -1, 2}, new long[] {2, 3, 6, 11, 18, 30});
  }
}
