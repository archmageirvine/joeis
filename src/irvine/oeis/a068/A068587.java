package irvine.oeis.a068;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A068545.
 * @author Sean A. Irvine
 */
public class A068587 extends Sequence0 {

  private Z mA = null;
  private Z mB = null;
  private Z mC = null;
  private Z mD = null;
  private boolean mEven = false;

  @Override
  public Z next() {
    if (mD == null) {
      if (mB == null) {
        mB = Z.ONE;
        return Z.ONE;
      }
      if (mC == null) {
        mC = Z.TWO;
        return Z.TWO;
      }
      mD = Z.THREE;
      return Z.THREE;
    }
    mEven = !mEven;
    final Z t = mEven ? mD.multiply(mC) : mD.multiply(mA);
    mA = mB;
    mB = mC;
    mC = mD;
    mD = t;
    return t;
  }
}
