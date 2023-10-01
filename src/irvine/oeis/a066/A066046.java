package irvine.oeis.a066;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066046 a(1) = 1; a(2) = 2; a(3) = 3; a(n+3) = a(n+2)*a(n+1) + a(n+1)*a(n) + a(n)*a(n+2).
 * @author Sean A. Irvine
 */
public class A066046 extends Sequence1 {

  private Z mA = null;
  private Z mB = null;
  private Z mC = null;

  @Override
  public Z next() {
    if (mC == null) {
      if (mA == null) {
        mA = Z.ONE;
        return Z.ONE;
      }
      if (mB == null) {
        mB = Z.TWO;
        return Z.TWO;
      }
      mC = Z.THREE;
      return Z.THREE;
    }
    final Z t = mC.multiply(mB).add(mB.multiply(mA)).add(mA.multiply(mC));
    mA = mB;
    mB = mC;
    mC = t;
    return t;
  }
}
