package irvine.oeis.a055;

import irvine.factor.factor.Jaguar;
import irvine.factor.prime.Fast;
import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;
import irvine.oeis.Sequence3;
import irvine.oeis.a000.A000720;

/**
 * A055399 Number of stages of sieve of Eratosthenes needed to identify n as prime or composite.
 * @author Sean A. Irvine
 */
public class A055399 extends Sequence3 {

  private final Fast mPrime = new Fast();
  private final MemorySequence mPrimePi = MemorySequence.cachedSequence(new A000720());
  private long mN = 2;

  @Override
  public Z next() {
    final int t = mPrime.isPrime(++mN) ? (int) mPrime.nextPrime((int) LongUtils.sqrt(mN)) : Jaguar.factor(mN).leastPrimeFactor().intValueExact();
    return mPrimePi.a(t - 1);
  }
}
