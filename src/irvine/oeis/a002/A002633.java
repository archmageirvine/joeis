package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002633.
 * @author Sean A. Irvine
 */
public class A002633 implements Sequence {

  private long mN = -1;
  private Z mA = null;
  private Z mB = null;
  private Z mC = null;

  @Override
  public Z next() {
    ++mN;
    final Z t;
    if (mA == null) {
      if (mC == null) {
        t = Z.ONE;
      } else if (mB == null) {
        t = Z.valueOf(-3);
      } else {
        t = Z.FIVE;
      }
    } else {
      t = mC.multiply(2 * mN - 5).subtract(mB.multiply(mN - 1).multiply(mN - 4)).subtract(mA.multiply(mN - 1).multiply(mN - 2));
    }
    mA = mB;
    mB = mC;
    mC = t;
    return mC;
  }
}
