package irvine.oeis.a061;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A061468 a(n) = d(n) + phi(n), where d(n) is the number of divisors (A000005) and phi(n) is Euler's totient function (A000010).
 * @author Sean A. Irvine
 */
public class A061468 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final FactorSequence fs = Jaguar.factor(++mN);
    return fs.phi().add(fs.sigma0());
  }
}

