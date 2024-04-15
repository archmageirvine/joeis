package irvine.oeis.a007;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A007430 Inverse Moebius transform applied thrice to natural numbers.
 * @author Sean A. Irvine
 */
public class A007430 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    for (final Z d : Jaguar.factor(++mN).divisors()) {
      sum = sum.add(Functions.SIGMA.z(d).multiply(Functions.SIGMA0.z(mN / d.longValueExact())));
    }
    return sum;
  }
}
