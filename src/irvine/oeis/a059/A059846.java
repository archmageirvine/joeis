package irvine.oeis.a059;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A059846 a(n) is the least prime p, such that next_prime(2*p) - 2*p = 2*n - 1.
 * @author Sean A. Irvine
 */
public class A059846 extends Sequence1 {

  private long mN = -1;
  private final Fast mPrime = new Fast();

  @Override
  public Z next() {
    mN += 2;
    long p = 1;
    while (true) {
      p = mPrime.nextPrime(p);
      if (mPrime.nextPrime(2 * p) - 2 * p == mN) {
        return Z.valueOf(p);
      }
    }
  }
}
