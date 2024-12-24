package irvine.oeis.a066;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066462 Numbers k such that phi(sigma(phi(k))) = sigma(k).
 * @author Sean A. Irvine
 */
public class A066462 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      if (Functions.PHI.z(Functions.SIGMA1.z(fs.phi())).equals(fs.sigma())) {
        return Z.valueOf(mN);
      }
    }
  }
}

