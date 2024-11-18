package irvine.oeis.a073;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A073126 a(n) is the least prime p(s) such that p(s) - p(s-n) is divisible by n, i.e., a(n) = p(s) = kn + p(s-n).
 * @author Sean A. Irvine
 */
public class A073126 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long p = 2;
    long q = 2;
    // Step ahead mN primes
    for (long k = 0; k < mN; ++k) {
      q = mPrime.nextPrime(q);
    }
    while (true) {
      if ((q - p) % mN == 0) {
        return Z.valueOf(q);
      }
      p = mPrime.nextPrime(p);
      q = mPrime.nextPrime(q);
    }
  }
}
