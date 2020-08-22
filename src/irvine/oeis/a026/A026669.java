package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026669 Sum{T(n-k,k)}, 0&lt;=k&lt;=[ n/2 ], T given by A026659.
 * @author Sean A. Irvine
 */
public class A026669 extends A026659 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 0; k <= mN / 2; ++k) {
      sum = sum.add(get(mN - k, k));
    }
    return sum;
  }
}
