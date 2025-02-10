package irvine.oeis.a059;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A059847 a(n) = 2*p + 2*n - 1, where p is the least prime such that next_prime(2*p) - 2*p = 2*n - 1.
 * @author Sean A. Irvine
 */
public class A059847 extends Sequence1 {

  private long mN = -1;
  private final Fast mPrime = new Fast();

  @Override
  public Z next() {
    mN += 2;
    long p = 1;
    while (true) {
      p = mPrime.nextPrime(p);
      final long q = mPrime.nextPrime(2 * p);
      if (q - 2 * p == mN) {
        return Z.valueOf(q);
      }
    }
  }
}
