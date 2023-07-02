package irvine.oeis.a064;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A064375 Numbers n such that sigma_2(n) &gt; phi(n)^3.
 * @author Sean A. Irvine
 */
public class A064375 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      if (fs.sigma2().compareTo(fs.phi().pow(3)) > 0) {
        return Z.valueOf(mN);
      }
    }
  }
}

