package irvine.oeis.a073;

import irvine.factor.prime.Fast;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A073887 Smallest prime p such that sum of p and the next n-1 primes is a perfect square, or 1 if no such prime exists.
 * @author Sean A. Irvine
 */
public class A073887 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    long p = 1;
    while (true) {
      p = mPrime.nextPrime(p);
      long q = p;
      long s = q;
      for (long k = 1; k < mN; ++k) {
        q = mPrime.nextPrime(q);
        s += q;
      }
      if (Predicates.SQUARE.is(s)) {
        return Z.valueOf(p);
      }
    }
  }
}
