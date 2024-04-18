package irvine.oeis.a054;

import irvine.factor.factor.Jaguar;
import irvine.math.IntegerUtils;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A054700 Number of 6-ary Lyndon words with trace 3 mod 6.
 * @author Sean A. Irvine
 */
public class A054700 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (final Z dd : Jaguar.factor(mN).divisors()) {
      final int d = dd.intValue();
      final int g = IntegerUtils.gcd(d, 6);
      if (3 % g == 0) {
        sum = sum.add(Z.SIX.pow(mN / d).multiply(g).multiply(Functions.MOBIUS.i((long) d)));
      }
    }
    return sum.divide(6L * mN);
  }
}
