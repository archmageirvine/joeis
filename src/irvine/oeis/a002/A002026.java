package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A002026 Generalized ballot numbers (first differences of Motzkin numbers).
 * @author Sean A. Irvine
 */
public class A002026 extends Sequence0 {

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
