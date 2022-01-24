package irvine.oeis.a054;

import irvine.factor.factor.Cheetah;
import irvine.math.IntegerUtils;
import irvine.math.LongUtils;
import irvine.math.Mobius;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A054200.
 * @author Sean A. Irvine
 */
public class A054200 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    if (++mN < 2) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    for (final Z d : Cheetah.factor(mN).divisors()) {
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

