package irvine.oeis.a074;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A074973 Smallest index i such that next_prime( 2*prime(i) ) - 2*prime(i) = 2n - 1.
 * @author Sean A. Irvine
 */
public class A074973 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long p = 1;
    long k = 0;
    while (true) {
      ++k;
      p = mPrime.nextPrime(p);
      final long q = mPrime.nextPrime(2 * p);
      if (q - 2 * p == 2 * mN - 1) {
        return Z.valueOf(k);
      }
    }
  }
}
