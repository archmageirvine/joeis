package irvine.oeis.a063;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.function.Functions;
import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A063710 Numbers k such that phi(sigma(k)+k) = sigma(k-phi(k)), where phi is A000010 and sigma is A000203.
 * @author Sean A. Irvine
 */
public class A063710 extends Sequence1 {

  private long mN = 9;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      if (Euler.phi(fs.sigma().add(mN)).equals(Functions.SIGMA.z(mN - fs.phi().longValueExact()))) {
        return Z.valueOf(mN);
      }
    }
  }
}
