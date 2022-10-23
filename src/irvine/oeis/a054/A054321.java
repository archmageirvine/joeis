package irvine.oeis.a054;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A054321 Smallest prime greater than 5^n.
 * @author Sean A. Irvine
 */
public class A054321 extends Sequence0 {

  private final Fast mPrime = new Fast();
  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : mA.multiply(5);
    return mPrime.nextPrime(mA);
  }
}
