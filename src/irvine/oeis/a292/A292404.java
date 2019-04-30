package irvine.oeis.a292;

import irvine.oeis.LinearRecurrence;

/**
 * A292404 p-INVERT of <code>(1,0,0,1,0,0,0,0,0,0,...)</code>, where p(S) <code>= 1 -</code> S^4.
 * @author Sean A. Irvine
 */
public class A292404 extends LinearRecurrence {

  /** Construct the sequence. */
  public A292404() {
    super(new long[] {1, 0, 0, 4, 0, 0, 6, 0, 0, 4, 0, 0, 1, 0, 0, 0}, new long[] {0, 0, 0, 1, 0, 0, 4, 1, 0, 6, 8, 1, 4, 28, 12, 2});
  }
}
