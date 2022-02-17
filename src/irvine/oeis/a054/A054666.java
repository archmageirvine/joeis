package irvine.oeis.a054;

import irvine.factor.factor.Cheetah;
import irvine.math.IntegerUtils;
import irvine.math.Mobius;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A054666 Number of 6-ary Lyndon words with trace 1 mod 6.
 * @author Sean A. Irvine
 */
public class A054666 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (final Z dd : Cheetah.factor(mN).divisors()) {
      final int d = dd.intValue();
      if (IntegerUtils.gcd(d, 6) == 1) {
        sum = sum.add(Z.SIX.pow(mN / d).multiply(Mobius.mobius(d)));
      }
    }
    return sum.divide(6L * mN);
  }
}
