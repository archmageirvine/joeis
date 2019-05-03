package irvine.oeis.a291;

import irvine.oeis.LinearRecurrence;

/**
 * A291234 p-INVERT of <code>(0,1,0,1,0,1,...)</code>, where <code>p(S) = 1 - S - S^2 - S^3 - S^4</code>.
 * @author Sean A. Irvine
 */
public class A291234 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291234() {
    super(new long[] {-1, -1, 5, 2, -7, -2, 5, 1}, new long[] {1, 2, 5, 12, 28, 67, 156, 370});
  }
}
