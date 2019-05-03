package irvine.oeis.a291;

import irvine.oeis.LinearRecurrence;

/**
 * A291014 p-INVERT of <code>(1,1,1,1,1,...)</code>, where <code>p(S) = (1 - S^3)^2</code>.
 * @author Sean A. Irvine
 */
public class A291014 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291014() {
    super(new long[] {-4, 12, -21, 22, -15, 6}, new long[] {0, 0, 2, 6, 12, 23});
  }
}
