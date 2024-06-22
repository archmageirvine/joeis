package irvine.oeis.a058;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A058821 Dimensions of homogeneous subspaces of shuffle algebra over 6-letter alphabet (see A058766 for 2-letter case).
 * @author Sean A. Irvine
 */
public class A058821 extends Sequence0 {

  protected int mN = -1;

  @Override
  public Z next() {
    if (++mN <= 1) {
      return mN == 0 ? Z.ONE : Z.SIX;
    }
    Z sum = Z.ZERO;
    for (final Z dd : Jaguar.factor(mN).divisors()) {
      final int d = dd.intValue();
      final Z z = Z.SIX.pow(d);
      sum = sum.add(z.multiply(Functions.MOBIUS.i(mN / d)));
    }
    return Z.SIX.pow(mN).subtract(sum.divide(mN));
  }
}
