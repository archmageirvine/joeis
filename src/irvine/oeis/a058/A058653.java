package irvine.oeis.a058;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A058653 Numbers k such that sigma(phi(k)) = phi(sigma(k)-k).
 * @author Sean A. Irvine
 */
public class A058653 extends Sequence1 {

  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      final Z sigma = fs.sigma();
      final Z phi = fs.phi();
      if (Functions.SIGMA.z(phi).equals(Functions.PHI.z(sigma.subtract(mN)))) {
        return Z.valueOf(mN);
      }
    }
  }
}
