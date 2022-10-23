package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A006847 Number of extreme points of the set of n X n symmetric doubly-stochastic matrices.
 * @author Sean A. Irvine
 */
public class A006847 extends Sequence0 {

  private Z mA = null;
  private Z mB = null;
  private Z mC = null;
  private Z mD = null;
  private long mN = 2;

  @Override
  public Z next() {
    if (mD == null) {
      if (mA == null) {
        mA = Z.ONE;
        return mA;
      }
      if (mB == null) {
        mB = Z.ONE;
        return mB;
      }
      if (mC == null) {
        mC = Z.TWO;
        return mC;
      }
      mD = Z.FIVE;
    } else {
      ++mN;
      final Z t = mD.add(mC.multiply(mN).multiply(mN))
        .subtract(mB.multiply(mN).multiply(mN - 1).divide2())
        .subtract(mA.multiply(mN).multiply(mN - 1).multiply(mN - 2));
      mA = mB;
      mB = mC;
      mC = mD;
      mD = t;
    }
    return mD;
  }
}
