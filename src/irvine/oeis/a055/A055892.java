package irvine.oeis.a055;

import irvine.factor.factor.Jaguar;
import irvine.math.LongUtils;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a008.A008284;

/**
 * A055892 Also aperiodic partitions of n into k parts.
 * @author Sean A. Irvine
 */
public class A055892 extends A008284 {

  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    Z sum = Z.ZERO;
    for (final Z dd : Jaguar.factor(LongUtils.gcd(mN, mM)).divisors()) {
      final long d = dd.longValue();
      final int m = Functions.MOBIUS.i(d);
      if (m != 0) {
        sum = sum.signedAdd(m == 1, get(mN / d, mM / d));
      }
    }
    return sum;
  }
}
