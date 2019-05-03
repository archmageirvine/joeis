package irvine.oeis.a291;

import irvine.oeis.LinearRecurrence;

/**
 * A291000 p-INVERT of <code>(1,1,1,1,1,...)</code>, where <code>p(S) = 1 - S - S^2 - S^3</code>.
 * @author Sean A. Irvine
 */
public class A291000 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291000() {
    super(new long[] {2, -4, 4}, new long[] {1, 3, 9});
  }
}
