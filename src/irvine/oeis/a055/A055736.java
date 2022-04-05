package irvine.oeis.a055;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A055736 Difference between number of prime factors of n and of phi(n).
 * @author Sean A. Irvine
 */
public class A055736 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    final FactorSequence fs = Cheetah.factor(++mN);
    return Z.valueOf(fs.omega() - Cheetah.factor(fs.phi()).omega());
  }
}
