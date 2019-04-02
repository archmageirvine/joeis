package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.a095.A095133;

/**
 * A005196 a(n) = Sum_t t*F(n,t), where F(n,t) (see A095133) is the number of forests with n (unlabeled) nodes and exactly t trees.
 * @author Sean A. Irvine
 */
public class A005196 extends A095133 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 1; k <= mN; ++k) {
      sum = sum.add(get(mN, mN, k).multiply(k));
    }
    return sum;
  }
}
