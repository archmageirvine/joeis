package irvine.oeis.a064;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a000.A000720;
import irvine.oeis.memory.MemorySequence;

/**
 * A064741 Length of A064743(n); Index of the largest prime factor of the n-th term of EKG-sequence.
 * @author Sean A. Irvine
 */
public class A064741 extends A064413 {

  private final MemorySequence mPrimePi = MemorySequence.cachedSequence(new A000720());

  @Override
  public Z next() {
    final Z k = super.next();
    return k.isZero() ? Z.ZERO : mPrimePi.a(Jaguar.factor(k).largestPrimeFactor().intValueExact() - 1);
  }
}

