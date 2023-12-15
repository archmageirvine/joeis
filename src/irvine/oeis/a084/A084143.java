package irvine.oeis.a084;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A084143 Number of partitions of n into a sum of two or more consecutive primes.
 * @author Sean A. Irvine
 */
public class A084143 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  private boolean is(long remaining, final long p) {
    for (long q = mPrime.nextPrime(p); q <= remaining; q = mPrime.nextPrime(q)) {
      if (q == remaining) {
        return true;
      }
      remaining -= q;
    }
    return false;
  }

  @Override
  public Z next() {
    ++mN;
    long count = 0;
    for (long p = 2; p < mN; p = mPrime.nextPrime(p)) {
      if (is(mN - p, p)) {
        ++count;
      }
    }
    return Z.valueOf(count);
  }
}

