package irvine.oeis.a063;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A063714 Values of r occurring in A063713.
 * @author Sean A. Irvine
 */
public class A063714 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      mN += 2;
      for (long p = 2; p < mN; p = mPrime.nextPrime(p)) {
        if (mPrime.isPrime(mN - p) && mPrime.isPrime(mN + p)) {
          return Z.valueOf(p);
        }
      }
    }
  }
}

