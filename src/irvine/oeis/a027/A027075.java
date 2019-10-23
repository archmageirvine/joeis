package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027075 <code>Sum{(k+1)*T(n,k)}, 0&lt;=k&lt;=2n</code>, T given by <code>A027052</code>.
 * @author Sean A. Irvine
 */
public class A027075 extends A027052 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 0; k <= 2 * mN; ++k) {
      sum = sum.add(get(mN, k).multiply(k + 1));
    }
    return sum;
  }
}
