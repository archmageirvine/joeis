package irvine.oeis.a055;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A055496 a(1) = 2; a(n) is smallest prime &gt; 2*a(n-1).
 * @author Sean A. Irvine
 */
public class A055496 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.TWO : mPrime.nextPrime(mA.multiply2());
    return mA;
  }
}
