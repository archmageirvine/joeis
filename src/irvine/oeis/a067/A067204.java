package irvine.oeis.a067;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067204 Numbers k such that sigma(sigma(k)) == phi(k) (mod sigma(k)).
 * @author Sean A. Irvine
 */
public class A067204 extends Sequence1 {

  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      final Z s = fs.sigma();
      if (Functions.SIGMA1.z(s).subtract(fs.phi()).mod(s).isZero()) {
        return Z.valueOf(mN);
      }
    }
  }
}

