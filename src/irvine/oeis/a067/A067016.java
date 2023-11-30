package irvine.oeis.a067;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A066865.
 * @author Sean A. Irvine
 */
public class A067016 extends Sequence0 {

  private Z mA = null;
  private Z mB = null;
  private Z mC = null;
  private Z mD = null;

  @Override
  public Z next() {
    if (mD == null) {
      if (mA == null) {
        mA = Z.ONE;
        return Z.ONE;
      }
      if (mB == null) {
        mB = Z.FOUR;
        return Z.FOUR;
      }
      if (mC == null) {
        mC = Z.THREE;
        return Z.THREE;
      }
      mD = Z.TWO;
      return Z.TWO;
    }
    final Z t = mD.add(1).max(mC.add(4)).max(mB.add(3)).max(mA.add(2));
    mA = mB;
    mB = mC;
    mC = mD;
    mD = t;
    return t;
  }
}
