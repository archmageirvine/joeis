package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A006720 Somos-4 sequence: a(0)=a(1)=a(2)=a(3)=1; for n &gt;= 4, a(n) = (a(n-1) * a(n-3) + a(n-2)^2) / a(n-4).
 * @author Sean A. Irvine
 */
public class A006720 extends Sequence0 {

  private Z mA = null;
  private Z mB = null;
  private Z mC = null;
  private Z mD = null;

  @Override
  public Z next() {
    if (mD == null) {
      if (mA == null) {
        mA = Z.ONE;
      } else if (mB == null) {
        mB = Z.ONE;
      } else if (mC == null) {
        mC = Z.ONE;
      } else {
        mD = Z.ONE;
      }
      return Z.ONE;
    }
    final Z t = mD.multiply(mB).add(mC.square()).divide(mA);
    mA = mB;
    mB = mC;
    mC = mD;
    mD = t;
    return t;
  }
}
