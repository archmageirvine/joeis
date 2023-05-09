package irvine.oeis.a063;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A063713 Numbers n such that there exist primes p, q, r with n*2 = p - r = r + q (values of r are given in A063714.
 * @author Sean A. Irvine
 */
public class A063713 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      mN += 2;
      for (long p = 2; p < mN; p = mPrime.nextPrime(p)) {
        if (mPrime.isPrime(mN - p) && mPrime.isPrime(mN + p)) {
          return Z.valueOf(mN / 2);
        }
      }
    }
  }
}

