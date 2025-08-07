package irvine.oeis.a066;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066147 Numbers k such that all 3 of EulerPhi(k) + 1, d(k) + 1, sigma(k) + 1 are simultaneously prime (d(k) denotes the number of divisors of k).
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
