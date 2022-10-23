package irvine.oeis.a009;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A009213 a(n) = gcd(d(n), phi(n)), where d is the number of divisors of n (A000005) and phi is Euler's totient function (A000010).
 * @author Sean A. Irvine
 */
public class A009213 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    final FactorSequence fs = Jaguar.factor(mN);
    return fs.phi().gcd(fs.sigma0());
  }
}
