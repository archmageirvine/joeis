package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002928 Magnetization for square lattice.
 * @author Sean A. Irvine
 */
public class A002928 implements Sequence {

  private long mN = -1;
  private Z mA = Z.ONE;
  private Z mB = Z.ZERO;
  private Z mC = Z.TWO.negate();
  private Z mD = Z.EIGHT.negate();

  @Override
  public Z next() {
    if (++mN < 4) {
      switch ((int) mN) {
        case 0:
          return mA;
        case 1:
          return mB;
        case 2:
          return mC;
        default:
          return mD;
      }
    }
    final Z t = mD.multiply(1 - mN).multiply(6)
      .add(mC.multiply(4))
      .add(mB.multiply(mN - 3).multiply(6))
      .add(mA.multiply(4 - mN))
      .divide(-mN);
    mA = mB;
    mB = mC;
    mC = mD;
    mD = t;
    return mD;
  }
}

