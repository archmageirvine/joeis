package irvine.oeis.a014;

import irvine.oeis.CoordinationSequence;

/**
 * A014671 Poincar&#233; series [or Poincare series] (or Molien series) for <code>mod 2</code> cohomology of alternating group <code>A_7</code> subset <code>A_8</code> acting on polynomial ring <code>F_2[ x_1,y_1,z_1,w_1 ]</code>.
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

