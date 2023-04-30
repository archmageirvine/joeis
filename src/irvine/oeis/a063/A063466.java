package irvine.oeis.a063;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A063466 Numbers k such that 2*phi(k) + 8 = sigma(k).
 * @author Sean A. Irvine
 */
public class A063466 extends Sequence1 {

  private long mN = 5;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      if (fs.phi().multiply2().add(8).equals(fs.sigma())) {
        return Z.valueOf(mN);
      }
    }
  }
}
