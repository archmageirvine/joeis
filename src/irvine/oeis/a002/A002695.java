package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;


/**
 * A002695.
 * @author Sean A. Irvine
 */
public class A002695 implements Sequence {

  private long mN = 2;
  private Z mA = null;
  private Z mB = null;

  @Override
  public Z next() {
    if (mB == null) {
      if (mA == null) {
        mA = Z.ONE;
        return Z.ONE;
      }
      mB = Z.NINE;
    } else {
      ++mN;
      final Z t = mA.multiply(mN).subtract(mB.multiply(3 * (2 * mN - 1))).divide(1 - mN);
      mA = mB;
      mB = t;
    }
    return mB;
  }
}
