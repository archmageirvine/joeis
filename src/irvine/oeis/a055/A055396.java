package irvine.oeis.a055;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000720;

/**
 * A055396 Smallest prime dividing n is a(n)-th prime (a(1)=0).
 * @author Sean A. Irvine
 */
public class A055396 extends Sequence1 {

  private final MemorySequence mPrimePi = MemorySequence.cachedSequence(new A000720());
  private long mN = 0;

  @Override
  public Z next() {
    return ++mN == 1 ? Z.ZERO : mPrimePi.a(Jaguar.factor(mN).leastPrimeFactor().intValueExact() - 1);
  }
}
