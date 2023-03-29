package irvine.oeis.a062;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A062385 Numbers k such that sigma(k) - phi(k) is a cube.
 * @author Sean A. Irvine
 */
public class A062385 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      if (ZUtils.isCube(fs.sigma().subtract(fs.phi()))) {
        return Z.valueOf(mN);
      }
    }
  }
}
