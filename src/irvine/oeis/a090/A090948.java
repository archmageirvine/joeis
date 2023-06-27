package irvine.oeis.a090;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A090948 a(n) = (1/24)*(n+1)*(n+6)*(n^3+26*n^2+225*n+636).
 * @author Sean A. Irvine
 */
public class A090948 extends LinearRecurrence {

  /** Construct the sequence. */
  public A090948() {
    super(-1, new long[] {-1, 6, -15, 20, -15, 6}, new long[] {0, 159, 518, 1198, 2358, 4200});
  }
}
