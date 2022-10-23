package irvine.oeis.a029;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A029940 a(n) = Product_{d|n} phi(d).
 * @author Sean A. Irvine
 */
public class A029940 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    Z prod = Z.ONE;
    for (final Z d : Jaguar.factor(++mN).divisors()) {
      prod = prod.multiply(Euler.phi(d));
    }
    return prod;
  }
}
