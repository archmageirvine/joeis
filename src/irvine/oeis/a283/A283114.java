package irvine.oeis.a283;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A283114 Number of nonequivalent ways (mod D_3) to place 3 points on an n X n X n triangular grid so that no two of them are on the same row, column or diagonal.
 * @author Sean A. Irvine
 */
public class A283114 extends LinearRecurrence {

  /** Construct the sequence. */
  public A283114() {
    super(1, new long[] {1, -3, 0, 7, -3, -6, 0, 6, 3, -7, 0, 3}, new long[] {0, 0, 0, 1, 5, 23, 82, 230, 560, 1208, 2392, 4405});
  }
}
