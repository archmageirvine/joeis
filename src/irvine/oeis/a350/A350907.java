package irvine.oeis.a350;

import irvine.math.z.Z;
import irvine.oeis.a057.A057277;

/**
 * A350907 Number of unlabeled initially connected digraphs with n arcs.
 * @author Sean A. Irvine
 */
public class A350907 extends A057277 {

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
