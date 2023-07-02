package irvine.oeis.a064;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A064376 Numbers n such that sigma_3(n) &gt; phi(n)^4.
 * @author Sean A. Irvine
 */
public class A064376 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      if (fs.sigma(3).compareTo(fs.phi().pow(4)) > 0) {
        return Z.valueOf(mN);
      }
    }
  }
}

