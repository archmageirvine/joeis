package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.a033.A033185;

/**
 * A005197 <code>a(n) = Sum_t t*F(n,t)</code>, where <code>F(n,t)</code> (see A033185) is the number of rooted forests with <code>n</code> (unlabeled) nodes and exactly t rooted trees.
 * @author Sean A. Irvine
 */
public class A005197 extends A033185 {

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
