package irvine.oeis.a022;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A022891 n-th prime p(k) such that p(k) + p(k+6) = p(k+2) + p(k+4).
 * @author Sean A. Irvine
 */
public class A022891 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mP = 1;

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      final long q = mPrime.nextPrime(mPrime.nextPrime(mP));
      final long r = mPrime.nextPrime(mPrime.nextPrime(q));
      final long s = mPrime.nextPrime(mPrime.nextPrime(r));
      if (mP + s == q + r) {
        return Z.valueOf(mP);
      }
    }
  }
}
