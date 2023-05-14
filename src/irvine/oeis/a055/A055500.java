package irvine.oeis.a055;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A055500 a(0)=1, a(1)=1, a(n) = largest prime &lt;= a(n-1) + a(n-2).
 * @author Sean A. Irvine
 */
public class A055500 extends Sequence0 {

  private final Fast mPrime = new Fast();
  private Z mA = null;
  private Z mB = null;

  @Override
  public Z next() {
    if (mB == null) {
      if (mA == null) {
        mA = Z.ONE;
      } else {
        mB = Z.ONE;
      }
      return Z.ONE;
    }
    final Z t = mA;
    mA = mB;
    mB = mPrime.prevPrime(t.add(mA).add(1));
    return mB;
  }
}
