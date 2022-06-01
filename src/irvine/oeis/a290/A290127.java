package irvine.oeis.a290;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A290127 a(n) = (1/5760)*(n + 5)*(15*n^7 + 225*n^6 + 1265*n^5 + 3707*n^4 + 7120*n^3 + 4900*n^2 - 6480*n + 27648).
 * @author Sean A. Irvine
 */
public class A290127 extends LinearRecurrence {

  /** Construct the sequence. */
  public A290127() {
    super(new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9}, new long[] {40, 252, 1457, 6168, 20773, 59279, 149271, 340821, 719187});
  }
}
