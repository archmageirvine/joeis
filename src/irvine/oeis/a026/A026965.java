package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026965 a(n) = Sum_{k=0..n} (k+1) * A026626(n,k).
 * @author Sean A. Irvine
 */
public class A026965 extends A026626 {

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
