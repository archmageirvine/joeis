package irvine.oeis.a054;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A054662 Number of monic irreducible polynomials over GF(5) with fixed nonzero trace.
 * @author Sean A. Irvine
 */
public class A054662 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (final Z dd : Jaguar.factor(mN).divisors()) {
      final int d = dd.intValue();
      if (Functions.GCD.i(d, 5) == 1) {
        sum = sum.add(Z.FIVE.pow(mN / d).multiply(Functions.MOBIUS.i(d)));
      }
    }
    return sum.divide(5L * mN);
  }
}
