package irvine.oeis.a038;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A038664 a(n)-th and (a(n)+1)-st primes are the first pair of primes that differ by exactly 2n; a(n) = -1 if no such pair of primes exists.
 * @author Sean A. Irvine
 */
public class A038664 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private int mGapSize = 0;

  @Override
  public Z next() {
    mGapSize += 2;
    long pi = 1;
    long p = 2;
    while (true) {
      final long q = p;
      p = mPrime.nextPrime(p);
      if (p - q == mGapSize) {
        return Z.valueOf(pi);
      }
      ++pi;
    }
  }
}

