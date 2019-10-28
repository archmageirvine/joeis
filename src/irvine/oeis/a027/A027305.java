package irvine.oeis.a027;

import irvine.math.z.Z;
import irvine.oeis.a008.A008315;

/**
 * A027305 <code>a(n) = Sum_{k=0..floor((n+1)/2)} (k+1) * A008315(n, k)</code>.
 * @author Sean A. Irvine
 */
public class A027305 extends A008315 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 0; k <= (mN + 1) / 2; ++k) {
      sum = sum.add(t(mN, k).multiply(k + 1));
    }
    return sum;
  }
}
