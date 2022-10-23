package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A006722 Somos-6 sequence: a(n) = (a(n-1) * a(n-5) + a(n-2) * a(n-4) + a(n-3)^2) / a(n-6), a(0) = ... = a(5) = 1.
 * @author Sean A. Irvine
 */
public class A006722 extends Sequence0 {

  private Z mA = null;
  private Z mB = null;
  private Z mC = null;
  private Z mD = null;
  private Z mE = null;
  private Z mF = null;

  @Override
  public Z next() {
    if (mF == null) {
      if (mA == null) {
        mA = Z.ONE;
      } else if (mB == null) {
        mB = Z.ONE;
      } else if (mC == null) {
        mC = Z.ONE;
      } else if (mD == null) {
        mD = Z.ONE;
      } else if (mE == null) {
        mE = Z.ONE;
      } else {
        mF = Z.ONE;
      }
      return Z.ONE;
    }
    final Z t = mF.multiply(mB).add(mE.multiply(mC).add(mD.square())).divide(mA);
    mA = mB;
    mB = mC;
    mC = mD;
    mD = mE;
    mE = mF;
    mF = t;
    return t;
  }
}
