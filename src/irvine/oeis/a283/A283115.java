package irvine.oeis.a283;

import irvine.oeis.LinearRecurrence;

/**
 * A283115 Number of nonequivalent ways <code>(mod D_3)</code> to place 4 points on an <code>n X n X n</code> triangular grid so that no two of them are on the same row, column or diagonal.
 * @author Sean A. Irvine
 */
public class A283115 extends LinearRecurrence {

  /** Construct the sequence. */
  public A283115() {
    super(new long[] {1, -3, 0, 6, 0, -6, -8, 12, 9, -13, -6, 6, 13, -9, -12, 8, 6, 0, -6, 0, 3}, new long[] {0, 0, 0, 0, 0, 3, 40, 242, 1038, 3504, 9998, 25158, 57410, 121023, 239148, 447552, 799764, 1373400, 2278290, 3666036, 5742396});
  }
}
