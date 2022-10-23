package irvine.oeis.a050;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A050512 a(n) = (a(n-1)*a(n-3) - a(n-2)^2) / a(n-4), with a(0) = 0, a(1) = a(2) = a(3) = 1, a(4) = -1.
 * @author Sean A. Irvine
 */
public class A050512 extends Sequence0 {

  private Z mA = null;
  private Z mB = null;
  private Z mC = null;
  private Z mD = null;

  @Override
  public Z next() {
    if (mD == null) {
      if (mA == null) {
        mA = Z.ZERO;
        return Z.ZERO;
      } else if (mA.isZero()) {
        mA = Z.ONE;
        return Z.ONE;
      } else if (mB == null) {
        mB = Z.ONE;
        return Z.ONE;
      } else if (mC == null) {
        mC = Z.ONE;
        return Z.ONE;
      } else {
        mD = Z.NEG_ONE;
        return Z.NEG_ONE;
      }
    }
    final Z t = mD.multiply(mB).subtract(mC.square()).divide(mA);
    mA = mB;
    mB = mC;
    mC = mD;
    mD = t;
    return t;
  }
}
