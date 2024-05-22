package irvine.oeis.a066;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066471 Numbers n such that sigma(phi(sigma(n))) = sigma(n).
 * @author Sean A. Irvine
 */
public class A066471 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      if (Functions.SIGMA1.z(Functions.PHI.z(fs.sigma())).equals(fs.sigma())) {
        return Z.valueOf(mN);
      }
    }
  }
}

