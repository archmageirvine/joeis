package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006631.
 * @author Sean A. Irvine
 */
public class A006631 implements Sequence {

  private long mN = -1;
  private Z mA = null;
  private Z mB = null;
  private Z mC = null;

  @Override
  public Z next() {
    if (++mN < 3) {
      if (mA == null) {
        mA = Z.ONE;
        return Z.ONE;
      }
      if (mB == null) {
        mB = Z.EIGHT;
        return Z.EIGHT;
      }
      mC = Z.valueOf(52);
    } else {
      final Z t = mC.multiply(5 * mN + 13).multiply(11 * mN + 29)
        .subtract(mB.multiply(7).multiply(Z.valueOf(mN).multiply(31).add(87).multiply(mN).add(62)))
        .add(mA.multiply(3 * mN + 1).multiply(3 * mN - 1).multiply(21))
        .divide2().divide(2 * mN + 7).divide(mN + 4);
      mA = mB;
      mB = mC;
      mC = t;
    }
    return mC;
  }
}

