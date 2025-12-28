package irvine.oeis.a077;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A077753 a(0) = 2, a(1) = 1, a(2n) = a(2n-1) * a(2n-2), a(2n+1) = a(2n-1) + a(2n).
 * @author Sean A. Irvine
 */
public class A077753 extends Sequence0 {

  private Z mA = null;
  private Z mB = null;
  private boolean mOdd = true;

  @Override
  public Z next() {
    if (mB == null) {
      if (mA == null) {
        mA = Z.TWO;
        return Z.TWO;
      }
      mB = Z.ONE;
      return Z.ONE;
    }
    mOdd = !mOdd;
    final Z t = mOdd ? mA.add(mB) : mA.multiply(mB);
    mA = mB;
    mB = t;
    return t;
  }
}
