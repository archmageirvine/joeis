package irvine.oeis.a062;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A062894 The prime indices of sequence A067836 (that sequence is conjectured to contain only primes).
 * @author Sean A. Irvine
 */
public class A062894 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private Z mA = null;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.TWO;
      return Z.ONE;
    }
    mF = mF.multiply(mA);
    mA = mPrime.nextPrime(mF.add(1)).subtract(mF);
    long k = 1;
    Z p = Z.TWO;
    while (!p.equals(mA)) {
      ++k;
      p = mPrime.nextPrime(p);
    }
    return Z.valueOf(k);
  }
}

