package irvine.oeis.a074;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A074169 Number of representations of n as a sum of two primes that are not congruent modulo 3.
 * @author Sean A. Irvine
 */
public class A074169 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long cnt = 0;
    for (long p = 2; 2 * p <= mN; p = mPrime.nextPrime(p)) {
      final long q = mN - p;
      if (p % 3 != q % 3 && mPrime.isPrime(q)) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
