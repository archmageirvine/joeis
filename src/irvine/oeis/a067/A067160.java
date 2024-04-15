package irvine.oeis.a067;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.function.Functions;
import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067160 Numbers k such that sigma(phi(sigma(k))) = phi(sigma(phi(k))).
 * @author Sean A. Irvine
 */
public class A067160 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      if (Functions.SIGMA.z(Euler.phi(fs.sigma())).equals(Euler.phi(Functions.SIGMA.z(fs.phi())))) {
        return Z.valueOf(mN);
      }
    }
  }
}
