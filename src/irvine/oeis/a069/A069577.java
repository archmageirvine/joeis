package irvine.oeis.a069;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A069577 Smallest prime p such that pi(n) &lt;= pi(p)*2, where pi(n) is the number of primes &lt;= n, A000720.
 * @author Sean A. Irvine
 */
public class A069577 extends Sequence2 {

  private final Fast mPrime = new Fast();
  private long mN = 1;
  private long mP = 2;

  @Override
  public Z next() {
    final long np = Functions.PRIME_PI.l(++mN);
    while (true) {
      if (2 * Functions.PRIME_PI.l(mP) >= np) {
        return Z.valueOf(mP);
      }
      mP = mPrime.nextPrime(mP);
    }
  }
}
