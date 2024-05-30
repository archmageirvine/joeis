package irvine.oeis.a054;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence0;

/**
 * A054200 Number of binary vectors (x_1,...x_n) satisfying Sum_{i=1..n} i*x_i = 3 (mod n+1) = size of Varshamov-Tenengolts code VT_3(n).
 * @author Sean A. Irvine
 */
public class A054200 extends Sequence0 {

  private int mN = 0;

  @Override
  public Z next() {
    if (++mN < 2) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    for (final Z d : Jaguar.factor(mN).divisors()) {
      final int dd = d.intValue();
      final int g = Functions.GCD.i(dd, 3);
      final int dg = dd / g;
      if ((dd & 1) == 1) {
        final Z t = Z.valueOf(Functions.PHI.l(dd) / Functions.PHI.l(dg)).shiftLeft(mN / dd);
        sum = ZUtils.mobiusAdd(Functions.MOBIUS.i((long) dg), sum, t);
      }
    }
    return sum.divide(2L * mN);
  }

}

