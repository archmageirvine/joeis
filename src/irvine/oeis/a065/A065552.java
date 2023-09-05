package irvine.oeis.a065;

import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A065552 a(n) = floor(sqrt(phi(10^n)*sigma(10^n) + 10^(3*n))).
 * @author Sean A. Irvine
 */
public class A065552 extends Sequence0 {

  private Z mT3 = null;
  private final FactorSequence mFactorSequence = new FactorSequence();

  @Override
  public Z next() {
    if (mT3 == null) {
      mT3 = Z.ONE;
      return Z.ONE;
    }
    mT3 = mT3.multiply(1000);
    mFactorSequence.add(2, FactorSequence.PRIME);
    mFactorSequence.add(5, FactorSequence.PRIME);
    return mFactorSequence.phi().multiply(mFactorSequence.sigma()).add(mT3).sqrt();
  }
}
