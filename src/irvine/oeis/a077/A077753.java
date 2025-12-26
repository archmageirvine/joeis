package irvine.oeis.a077;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A077753 a(0) = 2, a(1) = 1, a(2n) = a(2n-1) * a(2n-2), a(2n+1) = a(2n-1) + a(2n).
 * @author Sean A. Irvine
 */
public class A077753 extends Sequence1 {

  private Z mA = null;
  private Z mB = null;
  private boolean mOdd = false;

  @Override
  public Z next() {
    if (mB == null) {
      if (mA == null) {
        mA = Z.ONE;
        return Z.ONE;
      }
      mB = Z.TWO;
      return Z.TWO;
    }
    mOdd = !mOdd;
    final Z t = mOdd ? mA.add(mB) : mA.multiply(mB);
    mA = mB;
    mB = t;
    return t;
  }
}
