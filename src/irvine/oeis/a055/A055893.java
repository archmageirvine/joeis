package irvine.oeis.a055;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a008.A008284;

/**
 * A055893 Inverse Moebius transform of partition triangle A008284.
 * @author Sean A. Irvine
 */
public class A055893 extends A008284 {

  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    Z sum = Z.ZERO;
    for (final Z dd : Jaguar.factor(Functions.GCD.l(mN, mM)).divisors()) {
      final long d = dd.longValue();
      sum = sum.add(get(mN / d, mM / d));
    }
    return sum;
  }
}
