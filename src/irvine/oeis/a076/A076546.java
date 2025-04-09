package irvine.oeis.a076;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A076546 Let P = { p_1 = 3, p_2 = 5, ...} be the set of odd primes. If p_n in P can be written as p_n = q+r+s with q, r, s in P, let a(n) = largest such q, otherwise let a(n) = p_{n+1}.
 * @author Sean A. Irvine
 */
public class A076546 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mP = 2;

  private long find(final long p) {
    for (long q = mPrime.prevPrime(p); q > 2; q = mPrime.prevPrime(q)) {
      for (long r = mPrime.prevPrime(p - q + 1); r > 2; r = mPrime.prevPrime(r)) {
        if (mPrime.isPrime(p - q - r)) {
          return q;
        }
      }
    }
    return 0;
  }

  @Override
  public Z next() {
    mP = mPrime.nextPrime(mP);
    final long q = find(mP);
    return Z.valueOf(q == 0 ? mPrime.nextPrime(mP) : q);
  }
}
