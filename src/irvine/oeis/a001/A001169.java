package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001169.
 * @author Sean A. Irvine
 */
public class A001169 implements Sequence {

  private Z mA = null;
  private Z mB = null;
  private Z mC = null;

  @Override
  public Z next() {
    if (mA == null) {
      if (mC == null) {
        mC = Z.ONE;
        return Z.ONE;
      }
      mC = null;
      mA = Z.TWO;
      return Z.TWO;
    }
    if (mB == null) {
      mB = Z.SIX;
      return mB;
    }
    if (mC == null) {
      mC = Z.valueOf(19);
      return mC;
    }
    final Z t = mC.multiply(5).subtract(mB.multiply(7)).add(mA.shiftLeft(2));
    mA = mB;
    mB = mC;
    mC = t;
    return t;
  }
}
