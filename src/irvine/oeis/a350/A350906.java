package irvine.oeis.a350;

import irvine.math.z.Z;
import irvine.oeis.a057.A057278;

/**
 * A350906 Number of unlabeled initially-finally connected digraphs with n arcs.
 * @author Sean A. Irvine
 */
public class A350906 extends A057278 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 1; k <= mN; ++k) {
      sum = sum.add(gfRow(k, mN - 1).coeff(mN - 1).toZ());
    }
    return sum;
  }
}
