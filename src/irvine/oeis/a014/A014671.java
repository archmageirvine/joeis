package irvine.oeis.a014;

import irvine.oeis.recur.CoordinationSequence;

/**
 * A014671 Poincar\u00e9 series [or Poincare series] (or Molien series) for mod 2 cohomology of alternating group A_7 subset A_8 acting on polynomial ring F_2[ x_1,y_1,z_1,w_1 ].
 * @author Sean A. Irvine
 */
public class A014671 extends CoordinationSequence {

  /** Construct the sequence. */
  public A014671() {
    super(
      new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 1, 0, 0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
      new int[] {8, 12, 14, 15});
  }
}

