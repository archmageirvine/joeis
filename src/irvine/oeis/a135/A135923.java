package irvine.oeis.a135;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A135923 a(n) = (n^8 - 60*n^6 + 90*n^5 + 1160*n^4 - 3204*n^3 - 5349*n^2 + 26586*n - 23760)/24.
 * @author Sean A. Irvine
 */
public class A135923 extends LinearRecurrence {

  /** Construct the sequence. */
  public A135923() {
    super(3, new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9}, new long[] {0, 35, 1430, 13941, 75205, 289800, 897165, 2379300, 5620846});
  }
}
