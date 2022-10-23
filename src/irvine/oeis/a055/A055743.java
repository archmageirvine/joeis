package irvine.oeis.a055;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A055743 Phi(n) has fewer distinct prime divisors than n.
 * @author Sean A. Irvine
 */
public class A055743 extends Sequence1 {

  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      if (Jaguar.factor(fs.phi()).omega() < fs.omega()) {
        return Z.valueOf(mN);
      }
    }
  }
}
