package irvine.oeis.a055;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A055008 Numbers k such that gcd(phi(k), sigma(k)) = 1 with phi = A000010, sigma = A000203.
 * @author Sean A. Irvine
 */
public class A055008 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      if (fs.phi().gcd(fs.sigma()).equals(Z.ONE)) {
        return Z.valueOf(mN);
      }
    }
  }
}
