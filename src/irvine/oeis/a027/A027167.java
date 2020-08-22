package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027167 a(n) = Sum_{k=0..floor(n/2)} A027157(n-k, k).
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
