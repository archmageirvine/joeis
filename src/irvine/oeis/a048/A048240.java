package irvine.oeis.a048;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A048240 Number of new colors that can be mixed with n units of yellow, blue, red.
 * @author Sean A. Irvine
 */
public class A048240 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    for (final Z d : Jaguar.factor(mN).divisors()) {
      sum = sum.add(d.add(1).multiply(d.add(2)).multiply(Functions.MOBIUS.i(mN / d.longValue())));
    }
    return sum.divide2();
  }
}
