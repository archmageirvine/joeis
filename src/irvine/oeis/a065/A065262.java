package irvine.oeis.a065;

import irvine.oeis.LinearRecurrence;

/**
 * A065262 The nonpositive side <code>(-1, -2, -3, ...)</code> of the site swap sequence <code>A065261</code>. The bisection of odd terms of <code>A065261</code>.
 * @author Sean A. Irvine
 */
public class A065262 extends LinearRecurrence {

  /** Construct the sequence. */
  public A065262() {
    super(new long[] {-1, 0, 2, 0}, new long[] {1, 1, 5, 2});
  }
}
