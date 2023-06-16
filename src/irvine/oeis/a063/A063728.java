package irvine.oeis.a063;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A063728 a(n) = shift(a(n-1); a(n-3)), a(0)=2, a(1)=3.
 * @author Sean A. Irvine
 */
public class A063728 extends Sequence0 {

  private Z mA = null;
  private Z mB = null;
  private Z mC = null;

  @Override
  public Z next() {
    if (mC == null) {
      if (mA == null) {
        mA = Z.TWO;
        return mA;
      }
      if (mB == null) {
        mB = Z.THREE;
        return Z.THREE;
      }
      mC = Z.SIX;
      return Z.SIX;
    }
    final Z t = mC.shiftLeft(mA.longValueExact());
    mA = mB;
    mB = mC;
    mC = t;
    return t;
  }
}

