package irvine.oeis.a055;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A055743 Phi(n) has fewer distinct prime divisors than n.
 * @author Sean A. Irvine
 */
public class A055743 implements Sequence {

  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Cheetah.factor(++mN);
      if (Cheetah.factor(fs.phi()).omega() < fs.omega()) {
        return Z.valueOf(mN);
      }
    }
  }
}
