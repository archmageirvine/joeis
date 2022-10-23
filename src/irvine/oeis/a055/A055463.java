package irvine.oeis.a055;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A055463 a(n) = a(n-1)*2*a(n-2)-3*a(n-3).
 * @author Sean A. Irvine
 */
public class A055463 extends Sequence0 {

  private Z mA = null;
  private Z mB = null;
  private Z mC = null;

  @Override
  public Z next() {
    if (mC == null) {
      if (mA == null) {
        mA = Z.ZERO;
        return Z.ZERO;
      }
      if (mB == null) {
        mB = Z.ONE;
        return Z.ONE;
      }
      mC = Z.TWO;
      return Z.TWO;
    }
    final Z t = mC.multiply(mB).multiply2().subtract(mA.multiply(3));
    mA = mB;
    mB = mC;
    mC = t;
    return t;
  }
}
