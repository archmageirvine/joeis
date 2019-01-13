package irvine.oeis.a000;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.nt.mobius.Mobius;
import irvine.oeis.Sequence;

/**
 * A000048.
 * @author Sean A. Irvine
 */
public class A000048 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    if (++mN < 4) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    for (final Z d : Cheetah.factor(mN).divisors()) {
      final int dd = d.intValue();
      if ((dd & 1) == 1) {
        final Z t = Z.ONE.shiftLeft(mN / dd);
        sum = ZUtils.mobiusAdd(Mobius.mobius(dd), sum, t);
      }
    }
    return sum.divide(2L * mN);
  }

}

