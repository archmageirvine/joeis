package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002026.
 * @author Sean A. Irvine
 */
public class A002026 implements Sequence {

  private long mN = -1;
  private Z mA = Z.ZERO;
  private Z mB = null;
  private Z mC = null;

  @Override
  public Z next() {
    ++mN;
    if (mC == null) {
      mC = Z.ZERO;
    } else if (mB == null) {
      mB = Z.ZERO;
      mC = Z.ONE;
    } else {
      final Z t = mC.multiply(3 * mN + 4).add(mB.multiply(mN + 1)).subtract(mA.multiply(3 * (mN - 2))).divide(mN + 3);
      mA = mB;
      mB = mC;
      mC = t;
    }
    return mC;
  }
}
