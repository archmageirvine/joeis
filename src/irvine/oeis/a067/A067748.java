package irvine.oeis.a067;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067748 Smallest member of the first occurrence of exactly n consecutive primes whose sum of digits is also prime, or 0 if no such set of primes exists.
 * @author Sean A. Irvine
 */
public class A067748 extends Sequence1 {

  private int mN = 0;
  private final Fast mPrime = new Fast();

  private boolean is(final long p, final int n) {
    long q = p;
    for (int k = 0; k < n; ++k, q = mPrime.nextPrime(q)) {
      if (!mPrime.isPrime(Functions.DIGIT_SUM.l(q))) {
        return false;
      }
    }
    return !mPrime.isPrime(Functions.DIGIT_SUM.l(q));
  }

  @Override
  public Z next() {
    ++mN;
    long p = 1;
    while (true) {
      boolean notAStart;
      do {
        notAStart = mPrime.isPrime(Functions.DIGIT_SUM.l(p));
        p = mPrime.nextPrime(p);
      } while (notAStart);
      if (is(p, mN)) {
        return Z.valueOf(p);
      }
    }
  }
}
