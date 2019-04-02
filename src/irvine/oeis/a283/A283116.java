package irvine.oeis.a283;

import irvine.oeis.LinearRecurrence;

/**
 * A283116 Number of nonequivalent ways (mod D_3) to place 5 points on an n X n X n triangular grid so that no two of them are on the same row, column or diagonal.
 * @author Sean A. Irvine
 */
public class A283116 extends LinearRecurrence {

  /** Construct the sequence. */
  public A283116() {
    super(new long[] {1, -5, 5, 14, -30, -6, 50, -10, -44, 0, 44, 10, -50, 6, 30, -14, -5, 5}, new long[] {0, 0, 0, 0, 0, 0, 1, 45, 533, 3546, 16917, 64345, 207327, 587922, 1505924, 3549610, 7806420, 16188690});
  }
}
