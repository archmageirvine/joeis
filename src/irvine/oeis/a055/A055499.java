package irvine.oeis.a055;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A055499 a(0)=0, a(1)=1, a(n) = smallest prime &gt; a(n-1)+a(n-2).
 * @author Sean A. Irvine
 */
public class A055499 implements Sequence {

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
      mB = Z.ONE;
      return Z.ONE;
    }
    final Z t = mA;
    mA = mB;
    mB = mPrime.nextPrime(t.add(mA));
    return mB;
  }
}
