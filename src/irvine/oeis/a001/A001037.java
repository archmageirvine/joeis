package irvine.oeis.a001;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.math.Mobius;
import irvine.oeis.Sequence;

/**
 * A001037.
 * @author Sean A. Irvine
 */
public class A001037 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    for (final Z dd : Cheetah.factor(mN).divisors()) {
      final int d = dd.intValue();
      final Z z = Z.ONE.shiftLeft(d);
      sum = ZUtils.mobiusAdd(Mobius.mobius(mN / d), sum, z);
    }
    return sum.divide(mN);
  }
}
