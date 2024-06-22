package irvine.oeis.a068;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A068338 n!^2 * sum{k=1 to n} mu(k)/k^2, where mu(k) is the Moebius function.
 * @author Sean A. Irvine
 */
public class A068338 extends Sequence1 {

  private long mN = 0;
  private Z mF2 = Z.ONE;

  @Override
  public Z next() {
    mF2 = mF2.multiply(++mN * mN);
    Z sum = Z.ZERO;
    for (long k = 1; k <= mN; ++k) {
      sum = sum.add(mF2.divide(k * k).multiply(Functions.MOBIUS.i(k)));
    }
    return sum;
  }
}

