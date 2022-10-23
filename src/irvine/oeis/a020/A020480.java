package irvine.oeis.a020;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A020480 Primes p which divide no f(q)-1 or f(q)+1 for prime q &lt; p, where f(q) is the product of all primes &lt;= q.
 * @author Sean A. Irvine
 */
public class A020480 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      mN = mPrime.nextPrime(mN);
      boolean ok = true;
      for (long f = 1, p = 2; p < mN; p = mPrime.nextPrime(p)) {
        f *= p;
        f %= mN;
        if (f == 1 || f == mN - 1) {
          ok = false;
          break;
        }
      }
      if (ok) {
        return Z.valueOf(mN);
      }
    }
  }
}
