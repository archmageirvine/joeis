package irvine.oeis.a045;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A045698 Number of ways n can be written as the sum of two squares of primes.
 * @author Sean A. Irvine
 */
public class A045698 extends Sequence0 {

  private final Fast mPrime = new Fast();
  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    long cnt = 0;
    for (long q2, p = 2; (q2 = mN - p * p) >= p * p; p = mPrime.nextPrime(p)) {
      final long q = Functions.SQRT.l(q2);
      if (q * q == q2 && mPrime.isPrime(q)) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
