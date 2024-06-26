package irvine.oeis.a069;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A069224 Numbers n such that n^2 + n + A007918(n+2) is prime.
 * @author Sean A. Irvine
 */
public class A069224 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (mPrime.isPrime(++mN + mN * mN + mPrime.nextPrime(mN + 1))) {
        return Z.valueOf(mN);
      }
    }
  }
}

