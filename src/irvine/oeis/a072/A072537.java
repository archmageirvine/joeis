package irvine.oeis.a072;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A072537 a(1) = 2, a(2) = 3 and a(n) = the smallest prime which is a linear combination of all previous terms with all coefficients &gt;= 1.
 * @author Sean A. Irvine
 */
public class A072537 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private Z mA = null;
  private Z mB = null;
  private Z mS = Z.FIVE;

  @Override
  public Z next() {
    if (mB == null) {
      if (mA == null) {
        mA = Z.TWO;
        return Z.TWO;
      }
      mB = Z.THREE;
      return Z.THREE;
    }
    final Z t;
    if (mS.isEven()) {
      t = mPrime.nextPrime(mS.add(1));
    } else {
      t = mPrime.nextPrime(mS.subtract(1));
    }
    mS = mS.add(t);
    return t;
  }
}
