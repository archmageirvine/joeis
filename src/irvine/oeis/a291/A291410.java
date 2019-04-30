package irvine.oeis.a291;

import irvine.oeis.LinearRecurrence;

/**
 * A291410 p-INVERT of <code>(1,1,0,0,0,0,...)</code>, where p(S) <code>= 1 -</code> S - S^2 <code>- 2</code> S^3.
 * @author Sean A. Irvine
 */
public class A291410 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291410() {
    super(new long[] {2, 6, 7, 4, 2, 1}, new long[] {1, 3, 9, 26, 69, 186});
  }
}
