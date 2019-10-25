package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027167 <code>Sum{T(n-k,k)}, 0&lt;=k&lt;=[ n/2 ]</code>, T given by <code>A027157</code>.
 * @author Sean A. Irvine
 */
public class A027167 extends A027157 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 0; k <= mN / 2; ++k) {
      sum = sum.add(t(mN - k, k));
    }
    return sum;
  }
}
