package irvine.oeis.a283;

import irvine.oeis.LinearRecurrence;

/**
 * A283114 Number of nonequivalent ways <code>(mod D_3)</code> to place 3 points on an <code>n X n X n</code> triangular grid so that no two of them are on the same row, column or diagonal.
 * @author Sean A. Irvine
 */
public class A283114 extends LinearRecurrence {

  /** Construct the sequence. */
  public A283114() {
    super(new long[] {1, -3, 0, 7, -3, -6, 0, 6, 3, -7, 0, 3}, new long[] {0, 0, 0, 1, 5, 23, 82, 230, 560, 1208, 2392, 4405});
  }
}
