package irvine.oeis.a291;

import irvine.oeis.LinearRecurrence;

/**
 * A291399 p-INVERT of <code>(1,1,0,0,0,0,...)</code>, where <code>p(S) = 1 - S - S^2 - S^3 - S^4</code>.
 * @author Sean A. Irvine
 */
public class A291399 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291399() {
    super(new long[] {1, 4, 7, 7, 5, 3, 2, 1}, new long[] {1, 3, 8, 22, 59, 156, 412, 1093});
  }
}
