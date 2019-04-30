package irvine.oeis.a291;

import irvine.oeis.LinearRecurrence;

/**
 * A291404 p-INVERT of <code>(1,1,0,0,0,0,...)</code>, where p(S) <code>= 1 -</code> S^2 <code>- 2</code> S^4.
 * @author Sean A. Irvine
 */
public class A291404 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291404() {
    super(new long[] {2, 8, 12, 8, 3, 2, 1, 0}, new long[] {0, 1, 2, 4, 12, 23, 42, 89});
  }
}
