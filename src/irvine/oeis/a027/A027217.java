package irvine.oeis.a027;

import irvine.math.z.Z;
import irvine.oeis.a026.A026736;

/**
 * A027217 a(n) = Sum_{k=0..n-2} T(n,k)*T(n,k+2), T given by A026736.
 * @author Sean A. Irvine
 */
public class A027217 extends A026736 {

  private long mN = 1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 0; k < mN - 1; ++k) {
      sum = sum.add(get(mN, k).multiply(get(mN, k + 2)));
    }
    return sum;
  }
}
