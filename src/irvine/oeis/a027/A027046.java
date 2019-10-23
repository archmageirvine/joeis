package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027046 <code>Sum{T(n,k)*T(n,n+k)}, 0&lt;=k&lt;=n</code>, T given by <code>A027023</code>.
 * @author Sean A. Irvine
 */
public class A027046 extends A027023 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 0; k <= mN; ++k) {
      sum = sum.add(get(mN, k).multiply(get(mN, mN + k)));
    }
    return sum;
  }
}
