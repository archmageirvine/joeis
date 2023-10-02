package irvine.oeis.a066;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066147 Numbers n such that all 3 of EulerPhi(n) + 1, d(n) + 1, sigma(n) + 1 are simultaneously prime (d(n) denotes the number of divisors of n).
 * @author Sean A. Irvine
 */
public class A066147 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      if (fs.phi().add(1).isProbablePrime() && fs.sigma().add(1).isProbablePrime() && fs.sigma0().add(1).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
