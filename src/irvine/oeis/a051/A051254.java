package irvine.oeis.a051;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A051254 Mills primes.
 * @author Sean A. Irvine
 */
public class A051254 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.TWO : mPrime.nextPrime(mA.pow(3));
    return mA;
  }
}
