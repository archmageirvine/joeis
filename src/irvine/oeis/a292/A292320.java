package irvine.oeis.a292;

import irvine.oeis.LinearRecurrence;

/**
 * A292320 p-INVERT of <code>(1,0,0,1,0,0,1,0,0,...)</code>, where p(S) <code>= 1 -</code> S - S^3.
 * @author Sean A. Irvine
 */
public class A292320 extends LinearRecurrence {

  /** Construct the sequence. */
  public A292320() {
    super(new long[] {1, 0, 1, -3, 0, -2, 4, 0, 1}, new long[] {1, 1, 2, 4, 6, 12, 22, 36, 67});
  }
}
