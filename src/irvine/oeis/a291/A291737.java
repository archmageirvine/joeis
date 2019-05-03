package irvine.oeis.a291;

import irvine.oeis.LinearRecurrence;

/**
 * A291737 p-INVERT of <code>(1,0,1,0,0,0,0,...)</code>, where <code>p(S) = 1 - S - S^2 - S^3</code>.
 * @author Sean A. Irvine
 */
public class A291737 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291737() {
    super(new long[] {1, 0, 3, 1, 3, 2, 2, 1, 1}, new long[] {1, 2, 5, 11, 25, 54, 121, 267, 591});
  }
}
