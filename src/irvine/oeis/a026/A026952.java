package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026952 <code>Sum{T(n,k)*T(n,k+1)}, 0&lt;=k&lt;=n-1</code>, T given by <code>A026386</code>.
 * @author Sean A. Irvine
 */
public class A026952 extends A026386 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 0; k < mN; ++k) {
      sum = sum.add(get(mN, k).multiply(get(mN, mN - k - 1)));
    }
    return sum;
  }
}
