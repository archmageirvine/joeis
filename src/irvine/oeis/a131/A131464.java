package irvine.oeis.a131;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A131464 a(n) = 4*n^3 - 3*n^2 + 2*n - 1.
 * @author Sean A. Irvine
 */
public class A131464 extends LinearRecurrence {

  /** Construct the sequence. */
  public A131464() {
    super(1, new long[] {-1, 4, -6, 4}, new long[] {2, 23, 86, 215});
  }
}
