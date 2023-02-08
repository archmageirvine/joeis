package irvine.oeis.a061;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.a007.A007304;

/**
 * A061299 Least number whose number of divisors is A007304(n) (the n-th number that is the product of 3 distinct primes).
 * @author Sean A. Irvine
 */
public class A061299 extends A007304 {

  @Override
  public Z next() {
    final FactorSequence fs = Jaguar.factor(super.next());
    final Z[] pqr = fs.toZArray();
    assert pqr.length == 3;
    return Z.THREE.pow(pqr[1].subtract(1)).multiply(Z.FIVE.pow(pqr[0].subtract(1))).shiftLeft(pqr[2].intValueExact() - 1);
  }
}
