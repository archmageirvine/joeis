package irvine.oeis.a054;

import irvine.factor.factor.Cheetah;
import irvine.math.IntegerUtils;
import irvine.math.Mobius;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A054662 Number of monic irreducible polynomials over GF(5) with fixed nonzero trace.
 * @author Sean A. Irvine
 */
public class A054662 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (final Z dd : Cheetah.factor(mN).divisors()) {
      final int d = dd.intValue();
      if (IntegerUtils.gcd(d, 5) == 1) {
        sum = sum.add(Z.FIVE.pow(mN / d).multiply(Mobius.mobius(d)));
      }
    }
    return sum.divide(5L * mN);
  }
}
