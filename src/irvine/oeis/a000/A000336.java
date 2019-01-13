package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000336.
 * @author Sean A. Irvine
 */
public class A000336 implements Sequence {

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
        mB = Z.TWO;
        return Z.TWO;
      }
      if (mC == null) {
        mC = Z.THREE;
        return Z.THREE;
      }
      mD = Z.FOUR;
      return Z.FOUR;
    }
    final Z t = mA.multiply(mB).multiply(mC).multiply(mD);
    mA = mB;
    mB = mC;
    mC = mD;
    mD = t;
    return t;
  }
}

