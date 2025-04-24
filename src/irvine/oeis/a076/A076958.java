package irvine.oeis.a076;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A076958 Number of primes p with 2^n &lt; p &lt; 3^n.
 * @author Sean A. Irvine
 */
public class A076958 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private Z mLo = Z.ONE;
  private Z mHi = Z.ONE;

  @Override
  public Z next() {
    mLo = mLo.multiply2();
    mHi = mHi.multiply(3);
    long cnt = 0;
    for (Z p = mPrime.nextPrime(mLo); p.compareTo(mHi) < 0; p = mPrime.nextPrime(p)) {
      ++cnt;
    }
    return Z.valueOf(cnt);
  }
}

