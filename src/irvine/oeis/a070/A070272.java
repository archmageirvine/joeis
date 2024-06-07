package irvine.oeis.a070;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A070272 Numbers n such that reverse(n) = phi(n) + sigma(n).
 * @author Sean A. Irvine
 */
public class A070272 extends Sequence1 {

  private long mN = 274;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      if (Functions.REVERSE.z(mN).equals(fs.phi().add(fs.sigma()))) {
        return Z.valueOf(mN);
      }
    }
  }
}
