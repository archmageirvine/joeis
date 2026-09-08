package irvine.oeis.a086;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A086506 a(1) = 2, a(2n) = smallest prime of the type r*a(2n-1) +1, a(2n+1) = smallest prime of the type s*a(2n) -1.
 * @author Sean A. Irvine
 */
public class A086506 extends Sequence1 {

  private Z mA = null;
  private boolean mEven = false;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.TWO;
      return Z.TWO;
    }
    mEven = !mEven;
    final Z t = mA;
    if (mEven) {
      mA = mA.add(1);
    } else {
      mA = mA.add(t).subtract(1);
    }
    while (!mA.isProbablePrime()) {
      mA = mA.add(t);
    }
    return mA;
  }
}

