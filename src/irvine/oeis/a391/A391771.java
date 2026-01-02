package irvine.oeis.a391;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence3;

/**
 * A391771 Smallest number that is the sum of n &gt; 2 consecutive primes and also the sum of n consecutive composites.
 * @author Sean A. Irvine
 */
public class A391771 extends Sequence3 {

  private final Fast mPrime = new Fast();
  private long mN = 2;

  private long getPrimeSum(final long p) {
    long sum = 0;
    for (long k = 0, q = p; k < mN; ++k, q = mPrime.nextPrime(q)) {
      sum += q;
    }
    return sum;
  }

  private long getCompositeSum(final long c) {
    long sum = 0;
    for (long k = 0, d = c; k < mN; ++k, ++d) {
      while (mPrime.isPrime(d)) {
        ++d;
      }
      sum += d;
    }
    return sum;
  }

  @Override
  public Z next() {
    ++mN;
    long p = 2;
    long psum = getPrimeSum(p);
    long csum = 0;
    long c = 3;
    while (psum != csum) {
      if (psum < csum) {
        p = mPrime.nextPrime(p);
        psum = getPrimeSum(p);
      } else {
        ++c;
        csum = getCompositeSum(c);
      }
    }
    return Z.valueOf(psum);
  }
}
