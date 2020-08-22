package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026980 a(n) = Sum_{k=0..n} (k+1) * A026659(n,k).
 * @author Sean A. Irvine
 */
public class A026980 extends A026659 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 0; k <= mN; ++k) {
      sum = sum.add(get(mN, k).multiply(k + 1));
    }
    return sum;
  }
}
