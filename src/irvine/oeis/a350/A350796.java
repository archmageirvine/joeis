package irvine.oeis.a350;

import irvine.math.z.Z;

/**
 * A350796 Number of unlabeled digraphs with n arcs and a global source and sink.
 * @author Sean A. Irvine
 */
public class A350796 extends A350795 {

  /** Construct the sequence. */
  public A350796() {
    super(0);
  }

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 0; k <= mN + 1; ++k) {
      sum = sum.add(gfRow(k, mN).coeff(mN).toZ());
    }
    return sum;
  }
}
