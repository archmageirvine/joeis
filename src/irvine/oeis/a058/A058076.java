package irvine.oeis.a058;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A058076 Numbers n such that n | sigma_3(n) + sigma_2(n) + sigma_1(n) + sigma_0(n).
 * @author Sean A. Irvine
 */
public class A058076 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      if (fs.sigma(3).add(fs.sigma2()).add(fs.sigma()).add(fs.sigma0()).mod(mN) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}

