package irvine.oeis.a061;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A061366 Numbers k such that phi(k)+sigma(k) is a perfect cube.
 * @author Sean A. Irvine
 */
public class A061366 extends Sequence1 {

  private long mN = 98;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      if (ZUtils.isCube(fs.phi().add(fs.sigma()))) {
        return Z.valueOf(mN);
      }
    }
  }
}

