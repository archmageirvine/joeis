package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006720.
 * @author Sean A. Irvine
 */
public class A006720 implements Sequence {

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
