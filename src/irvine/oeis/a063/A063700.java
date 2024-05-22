package irvine.oeis.a063;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A063700 Numbers k such that sigma(k + d(k)) = sigma(k) + d(k), where sigma() = A000203(), d() = A000005().
 * @author Sean A. Irvine
 */
public class A063700 extends Sequence1 {

  private long mN = 2;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      if (fs.sigma0().add(fs.sigma()).equals(Functions.SIGMA1.z(fs.sigma0().add(mN)))) {
        return Z.valueOf(mN);
      }
    }
  }
}

