package irvine.oeis.a291;

import irvine.oeis.LinearRecurrence;

/**
 * A291036 p-INVERT of <code>(1,0,0,1,0,0,1,0,0,...)</code>, where p(S) <code>= 1 - 2</code> S <code>- 2</code> S^2.
 * @author Sean A. Irvine
 */
public class A291036 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291036() {
    super(new long[] {-1, 0, -2, 2, 2, 2}, new long[] {2, 6, 16, 46, 132, 376});
  }
}
