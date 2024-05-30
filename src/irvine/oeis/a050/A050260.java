package irvine.oeis.a050;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A050260 Quiteprimes: numbers k such that |2*(k mod p) - p| &lt;= p + 1 - sqrt(p) for all primes p &lt;= sqrt(k).
 * @author Sean A. Irvine
 */
public class A050260 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 1;

  @Override
  public Z next() {
    outer:
    while (true) {
      //++mN;
      mN = mPrime.nextPrime(mN); // it appears all such numbers are prime
      final long s = Functions.SQRT.l(mN);
      for (long p = 2; p <= s; p = mPrime.nextPrime(p)) {
        final long q = p + 1 - Math.abs((mN % p) * 2  - p);
        if (q * q < p) {
          continue outer;
        }
      }
      return Z.valueOf(mN);
    }
  }
}

