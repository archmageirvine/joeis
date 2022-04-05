package irvine.oeis.a055;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A055741 Phi(n) has more distinct prime factors than n.
 * @author Sean A. Irvine
 */
public class A055741 implements Sequence {

  private long mN = 6;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Cheetah.factor(++mN);
      if (Cheetah.factor(fs.phi()).omega() > fs.omega()) {
        return Z.valueOf(mN);
      }
    }
  }
}
