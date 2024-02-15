package irvine.oeis.a068;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A068367 Numbers n such that phi(n)^2+sigma(n)^2 is prime.
 * @author Sean A. Irvine
 */
public class A068367 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      if (fs.phi().square().add(fs.sigma().square()).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}

