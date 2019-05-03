package irvine.oeis.a071;

import irvine.oeis.LinearRecurrence;

/**
 * A071535 <code>(-1)^(n+1) *</code> Determinant of <code>n X n</code> matrix of form <code>[1^2 2^2 3^2 4^2 5^2 / 2^2 1^2 2^2 3^2 4^2 / 3^2 2^2 1^2 2^2 3^2 / 4^2 3^2 2^2 1^2 2^2 / 5^2 4^2 3^2 2^2 1^2]</code>.
 * @author Sean A. Irvine
 */
public class A071535 extends LinearRecurrence {

  /** Construct the sequence. */
  public A071535() {
    super(new long[] {1024, -1280, 640, -160, 20}, new long[] {1, 15, 176, 1680, 13824});
  }
}
