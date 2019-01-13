package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A010736.
 * @author Sean A. Irvine
 */
public class A010736 implements Sequence {

  private Z mA = null;
  private Z mB = null;
  private Z mC = null;
  private long mN = 2;

  @Override
  public Z next() {
    if (mC == null) {
      if (mA == null) {
        mA = Z.ONE;
        return Z.ONE;
      }
      if (mB == null) {
        mB = Z.THREE;
        return Z.THREE;
      }
      mC = Z.valueOf(12);
    } else {
      final Z n = Z.valueOf(++mN);
      final Z t = mC.multiply(n.multiply(12).add(11).multiply(n).subtract(11))
        .subtract(mB.multiply(mN - 3).multiply(2 * mN - 1))
        .add(mA.multiply(3 - mN))
        .divide(mN + 3)
        .divide(2 * mN - 1);
      mA = mB;
      mB = mC;
      mC = t;
    }
    return mC;
  }
}

