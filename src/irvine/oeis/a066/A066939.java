package irvine.oeis.a066;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066937.
 * @author Sean A. Irvine
 */
public class A066939 extends Sequence1 {

  private long mN = 13953;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      final Z phi = fs.phi();
      final Z sigma = fs.sigma();
      final FactorSequence fs1 = Jaguar.factor(phi);
      final FactorSequence fs2 = Jaguar.factor(sigma);
      if (phi.add(sigma).equals(fs1.phi().add(fs2.sigma()).subtract(fs1.sigma()).subtract(fs2.phi()))) {
        return Z.valueOf(mN);
      }
    }
  }
}
