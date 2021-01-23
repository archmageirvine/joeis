package irvine.oeis.a027;

import irvine.math.z.Z;
import irvine.oeis.a026.A026568;

/**
 * A027278 a(n) = Sum_{k=0..2n-1} T(n,k) * T(n,k+1), with T given by A026568.
 * @author Sean A. Irvine
 */
public class A027278 extends A026568 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 0; k < 2 * mN; ++k) {
      sum = sum.add(get(mN, k).multiply(get(mN, k + 1)));
    }
    return sum;
  }
}
