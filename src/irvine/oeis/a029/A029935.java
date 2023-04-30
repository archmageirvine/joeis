package irvine.oeis.a029;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A029935 a(n) = Sum_{d divides n} phi(d)*phi(n/d).
 * @author Sean A. Irvine
 */
public class A029935 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    Z sum = Z.ZERO;
    for (final Z d : Jaguar.factor(mN).divisors()) {
      sum = sum.add(Euler.phi(d).multiply(Euler.phi(mN.divide(d))));
    }
    return sum;
  }
}
