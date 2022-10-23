package irvine.oeis.a001;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A001031 Goldbach conjecture: a(n) = number of decompositions of 2n into sum of two primes (counting 1 as a prime).
 * @author Sean A. Irvine
 */
public class A001031 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    final long n = 2 * mN;
    long p = 1;
    long c = 0;
    do {
      if (mPrime.isPrime(n - p)) {
        ++c;
      }
      p = mPrime.nextPrime(p);
    } while (p <= mN);
    return Z.valueOf(c);
  }
}
