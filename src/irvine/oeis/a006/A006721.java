package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006721 Somos-5 sequence: <code>a(n) = (a(n-1) * a(n-4) + a(n-2) * a(n-3)) / a(n-5),</code> with <code>a(0) = a(1) = a(2) = a(3) = a(4) = 1</code>.
 * @author Sean A. Irvine
 */
public class A006721 implements Sequence {

  private Z mA = null;
  private Z mB = null;
  private Z mC = null;
  private Z mD = null;
  private Z mE = null;

  @Override
  public Z next() {
    if (mE == null) {
      if (mA == null) {
        mA = Z.ONE;
      } else if (mB == null) {
        mB = Z.ONE;
      } else if (mC == null) {
        mC = Z.ONE;
      } else if (mD == null) {
        mD = Z.ONE;
      } else {
        mE = Z.ONE;
      }
      return Z.ONE;
    }
    final Z t = mE.multiply(mB).add(mD.multiply(mC)).divide(mA);
    mA = mB;
    mB = mC;
    mC = mD;
    mD = mE;
    mE = t;
    return t;
  }
}
