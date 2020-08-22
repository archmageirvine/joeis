package irvine.oeis.a027;

import irvine.math.z.Z;
import irvine.oeis.a026.A026736;

/**
 * A027218 a(n) = Sum_{k=0..n-3} T(n,k)*T(n,k+3), T given by A026736.
 * @author Sean A. Irvine
 */
public class A027218 extends A026736 {

  private long mN = 2;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 0; k < mN - 2; ++k) {
      sum = sum.add(get(mN, k).multiply(get(mN, k + 3)));
    }
    return sum;
  }
}
