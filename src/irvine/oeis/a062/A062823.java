package irvine.oeis.a062;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A062823 Numbers k such that the number of divisors of k divides the number of divisors of the totient of k.
 * @author Sean A. Irvine
 */
public class A062823 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      if (Jaguar.factor(fs.phi()).sigma0().mod(fs.sigma0()).isZero()) {
        return Z.valueOf(mN);
      }
    }
  }
}
