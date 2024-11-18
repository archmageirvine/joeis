package irvine.oeis.a073;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A072339.
 * @author Sean A. Irvine
 */
public class A073125 extends Sequence1 {

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
        return Z.valueOf(p);
      }
      p = mPrime.nextPrime(p);
      q = mPrime.nextPrime(q);
    }
  }
}
