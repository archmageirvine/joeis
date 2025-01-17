package irvine.oeis.a073;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A073127 a(n) is the quotient arising in A073125 [or in A073126]: a(n)=[A073126(n)-A073125(n)]/n=[p(s+n)-p(s)]/n.
 * @author Sean A. Irvine
 */
public class A073127 extends Sequence1 {

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
        return Z.valueOf((q - p) / mN);
      }
      p = mPrime.nextPrime(p);
      q = mPrime.nextPrime(q);
    }
  }
}
