package irvine.oeis.a005;

import irvine.math.z.Z;

/**
 * A005199 <code>a(n) =</code> Sum_t t*F(n,t), where F(n,t) is the number of forests with n (unlabeled) nodes and exactly t trees, all of which are planted (that is, rooted trees in which the root has degree <code>1)</code>.
 * @author Sean A. Irvine
 */
public class A005199 extends A005198 {

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
