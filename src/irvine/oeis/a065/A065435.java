package irvine.oeis.a065;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence3;

/**
 * A065435 a(3) = 2, a(4) = 3; for n &gt; 4, a(n) = {a(n-2)}+{a(n-1)}, where {a} means largest prime &lt;= a.
 * @author Sean A. Irvine
 */
public class A065435 extends Sequence3 {

  private final Fast mPrime = new Fast();
  private Z mA = null;
  private Z mB = null;

  @Override
  public Z next() {
    if (mB == null) {
      if (mA == null) {
        mA = Z.TWO;
        return mA;
      }
      mB = Z.THREE;
      return mB;
    }
    final Z t = mPrime.prevPrime(mA.add(1)).add(mPrime.prevPrime(mB.add(1)));
    mA = mB;
    mB = t;
    return mB;
  }
}
