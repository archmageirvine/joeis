package irvine.oeis.a054;

import irvine.factor.factor.Jaguar;
import irvine.math.IntegerUtils;
import irvine.math.LongUtils;
import irvine.math.Mobius;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A054200 Number of binary vectors (x_1,...x_n) satisfying Sum_{i=1..n} i*x_i = 3 (mod n+1) = size of Varshamov-Tenengolts code VT_3(n).
 * @author Sean A. Irvine
 */
public class A054200 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    if (++mN < 2) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    for (final Z d : Jaguar.factor(mN).divisors()) {
      final int dd = d.intValue();
      final int g = IntegerUtils.gcd(dd, 3);
      final int dg = dd / g;
      if ((dd & 1) == 1) {
        final Z t = Z.valueOf(LongUtils.phi(dd) / LongUtils.phi(dg)).shiftLeft(mN / dd);
        sum = ZUtils.mobiusAdd(Mobius.mobius(dg), sum, t);
      }
    }
    return sum.divide(2L * mN);
  }

}

