package irvine.oeis.a071;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A071923 a(n) is the prime p such that pi(n^2, (n+1)^2+1) = pi((n+1)^2, p) where pi(s,t) = pi(t) - pi(s) is the number of primes between s and t.
 * @author Sean A. Irvine
 */
public class A071923 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  private long pi(final long m, final long n) {
    return Functions.PRIME_PI.l(n) - Functions.PRIME_PI.l(m);
  }

  @Override
  public Z next() {
    ++mN;
    long xc = 0;
    final long px = pi(mN * mN, (mN + 1) * (mN + 1));
    long p = mPrime.nextPrime((mN + 1) * (mN + 1) - 1);
    while (true) {
      if (++xc == px) {
        return Z.valueOf(p);
      }
      p = mPrime.nextPrime(p);
    }
  }
}
