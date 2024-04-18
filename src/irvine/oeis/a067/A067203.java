package irvine.oeis.a067;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067203 Numbers n such that sigma(n) = phi(n) + phi(n-1) + phi(n-2) + phi(n-3).
 * @author Sean A. Irvine
 */
public class A067203 extends Sequence1 {

  private long mN = 1253;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      if (fs.sigma().equals(fs.phi().add(Functions.PHI.z(mN - 1)).add(Functions.PHI.z(mN - 2)).add(Functions.PHI.z(mN - 3)))) {
        return Z.valueOf(mN);
      }
    }
  }
}

