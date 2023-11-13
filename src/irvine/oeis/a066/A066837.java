package irvine.oeis.a066;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066837 Least number k such that for the average of n consecutive primes, beginning with the k-th prime, is divisible by the average of their indices.
 * @author Sean A. Irvine
 */
public class A066837 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long sum = 0;
    long p = 2;
    long q = 2;
    long k = 1;
    // Initial run of n primes
    while (k <= mN) {
      sum += p;
      p = mPrime.nextPrime(p);
      ++k;
    }
    --k;
    while (true) {
      if (sum % (mN * (2 * k - mN + 1) / 2) == 0) {
        return Z.valueOf(k - mN + 1);
      }
      sum -= q;
      q = mPrime.nextPrime(q);
      sum += p;
      p = mPrime.nextPrime(p);
      ++k;
    }
  }
}
