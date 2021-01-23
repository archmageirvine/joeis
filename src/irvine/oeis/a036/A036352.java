package irvine.oeis.a036;

import irvine.factor.prime.Fast;
import irvine.math.LongUtils;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000720;

/**
 * A036352 Number of numbers up to 10^n that are products of two primes.
 * @author Sean A. Irvine
 */
public class A036352 implements Sequence {

  private final MemorySequence mPrimePi = MemorySequence.cachedSequence(new PrependSequence(new A000720(), 0));
  private final Fast mPrime = new Fast();
  private long mLimit = 1;

  @Override
  public Z next() {
    mLimit *= 10;
    final long sqrt = LongUtils.sqrt(mLimit);
    long sum = 0;
    for (long p = 2; p <= sqrt; p = mPrime.nextPrime(p)) {
      sum += mPrimePi.a((int) (mLimit / p)).intValueExact();
    }
    return Z.valueOf(sum).subtract(Binomial.binomial(mPrimePi.a((int) sqrt), Z.TWO));
  }
}
