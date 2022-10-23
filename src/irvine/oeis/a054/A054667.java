package irvine.oeis.a054;

import irvine.factor.factor.Jaguar;
import irvine.math.IntegerUtils;
import irvine.math.Mobius;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A054667 Number of 6-ary Lyndon words with trace 2 mod 6.
 * @author Sean A. Irvine
 */
public class A054667 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (final Z dd : Jaguar.factor(mN).divisors()) {
      final int d = dd.intValue();
      final int g = IntegerUtils.gcd(d, 6);
      if (2 % g == 0) {
        sum = sum.add(Z.SIX.pow(mN / d).multiply(g).multiply(Mobius.mobius(d)));
      }
    }
    return sum.divide(6L * mN);
  }
}
