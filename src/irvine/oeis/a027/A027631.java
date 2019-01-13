package irvine.oeis.a027;

import irvine.oeis.LinearRecurrence;

/**
 * A027631.
 * @author Sean A. Irvine
 */
public class A027631 extends LinearRecurrence {

  /** Construct the sequence. */
  public A027631() {
    super(new long[] {-1, 2, 1, -3, 0, -1, 3, 1, -4, 2, 0, 2, 1, -6, 1, 2, 0, 2, -4, 1, 3, -1, 0, -3, 1, 2}, new long[] {1, 1, 4, 6, 15, 24, 49, 78, 141, 219, 364, 550, 861, 1261, 1884, 2682, 3856, 5350, 7452, 10100, 13699, 18183, 24104, 31404, 40816, 52297});
  }
}
