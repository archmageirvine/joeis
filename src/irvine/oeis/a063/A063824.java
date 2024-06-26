package irvine.oeis.a063;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A063824 Numbers k such that sigma(phi(k^3)) = phi(sigma(k^3)).
 * @author Sean A. Irvine
 */
public class A063824 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final FactorSequence fs = Jaguar.factor(mN.pow(3));
      if (Functions.SIGMA1.z(fs.phi()).equals(Functions.PHI.z(fs.sigma()))) {
        return mN;
      }
    }
  }
}
