package irvine.oeis.a291;

import irvine.oeis.LinearRecurrence;

/**
 * A291222 p-INVERT of <code>(0,1,0,1,0,1,...)</code>, where <code>p(S) = 1 - S^2 - S^3</code>.
 * @author Sean A. Irvine
 */
public class A291222 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291222() {
    super(new long[] {1, 0, -4, 1, 4, 0}, new long[] {0, 1, 1, 3, 5, 9});
  }
}
