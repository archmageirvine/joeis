package irvine.oeis.a066;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066950 Numbers k such that phi(sigma(k)) + sigma(phi(k)) = 2k.
 * @author Sean A. Irvine
 */
public class A066950 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      final Z phi = fs.phi();
      final Z sigma = fs.sigma();
      final FactorSequence fs1 = Jaguar.factor(phi);
      final FactorSequence fs2 = Jaguar.factor(sigma);
      if (fs1.sigma().add(fs2.phi()).equals(2 * mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
