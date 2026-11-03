package irvine.oeis.a087;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A087242 Smallest prime number p such that n+p = q is also a prime, or 0 if no such prime number exists.
 * @author Sean A. Irvine
 */
public class A087242 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    if ((mN & 1) == 1) {
      return mPrime.isPrime(mN + 2) ? Z.TWO : Z.ZERO;
    }
    long p = 2;
    while (!mPrime.isPrime(mN + p)) {
      p = mPrime.nextPrime(p);
    }
    return Z.valueOf(p);
  }
}

