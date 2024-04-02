package irvine.oeis.a069;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A069065.
 * @author Sean A. Irvine
 */
public class A069066 extends Sequence1 {

  private long mN = 2;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      if (ZUtils.isTriangular(fs.sigma().add(fs.phi()))) {
        return Z.valueOf(mN);
      }
    }
  }
}

