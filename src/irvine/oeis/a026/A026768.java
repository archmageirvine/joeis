package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026768 a(n) = Sum_{k=0..floor(n/2)} T(n-k,k), T given by A026758.
 * @author Sean A. Irvine
 */
public class A026768 extends A026758 {

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
