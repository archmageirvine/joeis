package irvine.oeis.a080;

import irvine.factor.prime.Fast;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A080693 Numbers of the form p^2*q + r*s where p,q,r,s are (not necessarily distinct) primes.
 * @author Sean A. Irvine
 */
public class A080693 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 11;

  private boolean is(final long n) {
    for (long p = 2; 2 * p * p < n; p = mPrime.nextPrime(p)) {
      for (long q = 2; q * p * p < n; q = mPrime.nextPrime(q)) {
        final long t = n - q * p * p;
        if (Predicates.SEMIPRIME.is(t)) {
          return true;
        }
      }
    }
    return false;
  }

  @Override
  public Z next() {
    while (true) {
      if (is(++mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
