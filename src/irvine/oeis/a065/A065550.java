package irvine.oeis.a065;

import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A065550 a(n) = floor(sqrt(phi(w)*sigma(w)+w^2)), where w=10^n.
 * @author Sean A. Irvine
 */
public class A065550 extends Sequence1 {

  private Z mT2 = Z.ONE;
  private final FactorSequence mFactorSequence = new FactorSequence();

  @Override
  public Z next() {
    mT2 = mT2.multiply(100);
    mFactorSequence.add(2, FactorSequence.PRIME);
    mFactorSequence.add(5, FactorSequence.PRIME);
    return mFactorSequence.phi().multiply(mFactorSequence.sigma()).add(mT2).sqrt();
  }
}
