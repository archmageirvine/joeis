package irvine.oeis.a157;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A157861 a(n) = 3600*n^2 + n.
 * @author Sean A. Irvine
 */
public class A157861 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157861() {
    super(1, new long[] {1, -3, 3}, new long[] {3601, 14402, 32403});
  }
}
