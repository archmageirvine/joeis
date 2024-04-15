package irvine.oeis.a063;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A063943 Numbers n such that phi(n) = sigma(n) - sigma(n+1).
 * @author Sean A. Irvine
 */
public class A063943 extends Sequence1 {

  private long mN = 169;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      if (fs.phi().equals(fs.sigma().subtract(Functions.SIGMA.z(mN + 1)))) {
        return Z.valueOf(mN);
      }
    }
  }
}
