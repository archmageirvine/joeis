package irvine.oeis.a072;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A072743 Greater members of a pair of primes (p, q) such that, for some integer k, (p+q)/2 = 2^k and p &gt; 2^(k-1).
 * @author Sean A. Irvine
 */
public class A072743 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 8;
  private long mP = 2;

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      final long q = mN - mP;
      if (q > mP) {
        if (mPrime.isPrime(q)) {
          return Z.valueOf(q);
        }
      } else {
        mP = mPrime.prevPrime(mP);
        mN *= 2;
      }
    }
  }
}
