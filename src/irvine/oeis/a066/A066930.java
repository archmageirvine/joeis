package irvine.oeis.a066;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066930 Numbers k such that phi(sigma(k)) divides sigma(phi(k)).
 * @author Sean A. Irvine
 */
public class A066930 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      if (Functions.SIGMA1.z(fs.phi()).mod(Functions.PHI.z(fs.sigma())).isZero()) {
        return Z.valueOf(mN);
      }
    }
  }
}
