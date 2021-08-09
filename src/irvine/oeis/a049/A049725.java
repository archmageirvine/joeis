package irvine.oeis.a049;

import irvine.math.z.Z;

/**
 * A049725 a(n) = Sum_{i=0..2n} (-1)^i * T(i,2n-i), array T as in A049723.
 * @author Sean A. Irvine
 */
public class A049725 extends A049723 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 0; k <= 2 * mN; ++k) {
      sum = sum.signedAdd((k & 1) == 0, Z.valueOf(t(k, 2 * mN - k)));
    }
    return sum;
  }
}
