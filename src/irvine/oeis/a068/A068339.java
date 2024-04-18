package irvine.oeis.a068;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A068339 n!^3 *sum{k=1 to n} mu(k)/k^3, where mu(k) is the Moebius function A008683.
 * @author Sean A. Irvine
 */
public class A068339 extends Sequence1 {

  private long mN = 0;
  private Z mF2 = Z.ONE;

  @Override
  public Z next() {
    mF2 = mF2.multiply(++mN * mN * mN);
    Z sum = Z.ZERO;
    for (long k = 1; k <= mN; ++k) {
      sum = ZUtils.mobiusAdd(Functions.MOBIUS.i(k), sum, mF2.divide(k * k * k));
    }
    return sum;
  }
}

