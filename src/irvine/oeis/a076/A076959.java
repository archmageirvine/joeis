package irvine.oeis.a076;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A076959 Number of primes between 3^n and 4^n.
 * @author Sean A. Irvine
 */
public class A076959 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private Z mLo = Z.ONE;
  private Z mHi = Z.ONE;

  @Override
  public Z next() {
    mLo = mLo.multiply(3);
    mHi = mHi.multiply(4);
    long cnt = 0;
    for (Z p = mPrime.nextPrime(mLo); p.compareTo(mHi) < 0; p = mPrime.nextPrime(p)) {
      ++cnt;
    }
    return Z.valueOf(cnt);
  }
}

