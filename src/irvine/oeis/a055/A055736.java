package irvine.oeis.a055;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A055736 Difference between number of prime factors of n and of phi(n).
 * @author Sean A. Irvine
 */
public class A055736 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final FactorSequence fs = Jaguar.factor(++mN);
    return Z.valueOf(fs.omega() - Jaguar.factor(fs.phi()).omega());
  }
}
