package irvine.oeis.a054;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A054549 Number of symmetric nonnegative integer 9 X 9 matrices with sum of elements equal to 4*n, under action of dihedral group D_4.
 * @author Sean A. Irvine
 */
public class A054549 extends LinearRecurrence {

  /** Construct the sequence. */
  public A054549() {
    super(new long[] {1, -9, 30, -30, -75, 243, -152, -360, 690, -130, -780, 780, 130, -690, 360, 152, -243, 75, 30, -30, 9}, new long[] {1, 9, 51, 219, 786, 2466, 6974, 18126, 43929, 100321, 217683, 451707, 901128, 1735752, 3239928, 5878328, 10393902, 17950878, 30340682, 50273658, 81787476});
  }
}
