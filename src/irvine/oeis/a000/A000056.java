package irvine.oeis.a000;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A000056 Order of the group SL(2,Z_n).
 * @author Sean A. Irvine
 */
public class A000056 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    for (final Z d : Jaguar.factor(++mN).divisors()) {
      final long dd = d.longValue();
      final long v = mN / dd;
      final Z s = Z.valueOf(v).square();
      sum = ZUtils.mobiusAdd(Functions.MOBIUS.i(dd), sum, s);
    }
    return sum.multiply(mN);
  }
}

