package irvine.oeis.a062;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A062042 a(1) = 2, a(n) = least number greater than a(n-1) such that a(n-1) + a(n) is a prime.
 * @author Sean A. Irvine
 */
public class A062042 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private Z mA = Z.ZERO;

  @Override
  public Z next() {
    mA = mPrime.nextPrime(mA.multiply2()).subtract(mA);
    return mA;
  }
}
