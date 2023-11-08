package irvine.oeis.a104;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A104081 Smallest prime &gt;= 3^n.
 * @author Sean A. Irvine
 */
public class A104081 extends Sequence0 {

  private final Fast mPrime = new Fast();
  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : mA.multiply(3);
    return mPrime.nextPrime(mA.subtract(1));
  }
}
