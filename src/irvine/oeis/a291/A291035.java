package irvine.oeis.a291;

import irvine.oeis.LinearRecurrence;

/**
 * A291035 p-INVERT of <code>(1,0,0,1,0,0,1,0,0,...)</code>, where p(S) <code>= 1 -</code> S <code>- 2</code> S^2.
 * @author Sean A. Irvine
 */
public class A291035 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291035() {
    super(new long[] {-1, 0, -1, 2, 2, 1}, new long[] {1, 3, 5, 12, 27, 58});
  }
}
