package irvine.oeis.a027;

import irvine.math.z.Z;
import irvine.oeis.a026.A026323;

/**
 * A027312 a(n) = Sum_{k=0..n+2} (k+1) * A026323(n, k).
 * @author Sean A. Irvine
 */
public class A027312 extends A026323 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 0; k <= mN + 2; ++k) {
      sum = sum.add(get(mN, k).multiply(k + 1));
    }
    return sum;
  }
}
