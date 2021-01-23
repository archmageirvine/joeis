package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.factor.prime.Fast;

/**
 * A002372 Goldbach conjecture: number of decompositions of 2n into ordered sums of two odd primes.
 * @author Sean A. Irvine
 */
public class A002372 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    final long m = 2 * ++mN;
    long c = 0;
    for (long p = 3; p <= mN; p = mPrime.nextPrime(p)) {
      if (mPrime.isPrime(m - p)) {
        c += p == mN ? 1 : 2;
      }
    }
    return Z.valueOf(c);
  }
}
