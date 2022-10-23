package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A008269 Number of strings on n symbols in Stockhausen problem.
 * @author Sean A. Irvine
 */
public class A008269 extends Sequence0 {

  private long mN = 0;
  private Z mA = Z.ONE;
  private Z mB = Z.TWO;
  private Z mC = Z.NINE;

  @Override
  public Z next() {
    if (++mN <= 3) {
      if (mN == 1) {
        return mA;
      }
      if (mN == 2) {
        return mB;
      }
    } else {
      final Z t = mC.multiply(Z.TWO.multiply(mN).subtract(5).multiply(mN).add(4))
        .subtract(mB.multiply(Z.FOUR.multiply(mN).subtract(15).multiply(mN).add(14)))
        .add(mA.multiply(Z.TWO.multiply(mN).subtract(10).multiply(mN).add(12)));
      mA = mB;
      mB = mC;
      mC = t;
    }
    return mC;
  }
}

