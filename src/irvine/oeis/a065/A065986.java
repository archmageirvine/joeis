package irvine.oeis.a065;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A065986 Numbers k such that sigma(k) = phi(k+1) + phi(k) + phi(k-1).
 * @author Sean A. Irvine
 */
public class A065986 extends Sequence1 {

  private long mN = 5;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      if (fs.sigma().equals(fs.phi().add(Functions.PHI.z(mN + 1)).add(Functions.PHI.z(mN - 1)))) {
        return Z.valueOf(mN);
      }
    }
  }
}
