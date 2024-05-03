package irvine.oeis.a069;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A069479 Smallest n-tuply-lonely non-twin prime.
 * @author Sean A. Irvine
 */
public class A069479 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private int mN = 0;

  private boolean is(final long p) {
    if (mPrime.isPrime(p + 2) || mPrime.isPrime(p - 2)) {
      return false;
    }
    long next = mPrime.nextPrime(p);
    for (int k = 0; k < mN; ++k) {
      final long t = mPrime.nextPrime(next);
      if (t - next != 2) {
        return false;
      }
      next = mPrime.nextPrime(t);
    }
    long prev = mPrime.prevPrime(p);
    for (int k = 0; k < mN; ++k) {
      final long t = mPrime.prevPrime(prev);
      if (prev - t != 2) {
        return false;
      }
      prev = mPrime.prevPrime(t);
    }
    return true;
  }

  @Override
  public Z next() {
    ++mN;
    long p = 19;
    while (true) {
      p = mPrime.nextPrime(p);
      if (is(p)) {
        return Z.valueOf(p);
      }
    }
  }
}

