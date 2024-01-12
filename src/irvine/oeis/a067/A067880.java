package irvine.oeis.a067;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067880 Numbers k such that phi(k) = phi(sigma(k)-k).
 * @author Sean A. Irvine
 */
public class A067880 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      if (fs.phi().equals(Euler.phi(fs.sigma().subtract(mN)))) {
        return Z.valueOf(mN);
      }
    }
  }
}
