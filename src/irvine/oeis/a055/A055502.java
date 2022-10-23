package irvine.oeis.a055;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A055502 a(0)=0, a(1)=2, a(n) = smallest prime &gt; a(n-1)+a(n-2).
 * @author Sean A. Irvine
 */
public class A055502 extends Sequence0 {

  private final Fast mPrime = new Fast();
  private Z mA = null;
  private Z mB = null;

  @Override
  public Z next() {
    if (mB == null) {
      if (mA == null) {
        mA = Z.ZERO;
        return Z.ZERO;
      }
      mB = Z.TWO;
      return Z.TWO;
    }
    final Z t = mA;
    mA = mB;
    mB = mPrime.nextPrime(t.add(mA));
    return mB;
  }
}
