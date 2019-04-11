package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006723 Somos-7 sequence: <code>a(n) = (a(n-1) * a(n-6) + a(n-2) * a(n-5) + a(n-3) * a(n-4)) / a(n-7), a(0) = ... = a(6) = 1</code>.
 * @author Sean A. Irvine
 */
public class A006723 implements Sequence {

  private Z mA = null;
  private Z mB = null;
  private Z mC = null;
  private Z mD = null;
  private Z mE = null;
  private Z mF = null;
  private Z mG = null;

  @Override
  public Z next() {
    if (mG == null) {
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
      } else if (mF == null) {
        mF = Z.ONE;
      } else {
        mG = Z.ONE;
      }
      return Z.ONE;
    }
    final Z t = mG.multiply(mB).add(mF.multiply(mC).add(mE.multiply(mD))).divide(mA);
    mA = mB;
    mB = mC;
    mC = mD;
    mD = mE;
    mE = mF;
    mF = mG;
    mG = t;
    return t;
  }
}
