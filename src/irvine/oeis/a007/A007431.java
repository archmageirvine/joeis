package irvine.oeis.a007;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A007431 a(n) = Sum_{d|n} phi(d)*mu(n/d).
 * @author Sean A. Irvine
 */
public class A007431 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    for (final Z d : Jaguar.factor(++mN).divisors()) {
      sum = sum.add(Functions.PHI.z(d).multiply(Functions.MOBIUS.i(mN / d.longValueExact())));
    }
    return sum;
  }
}
