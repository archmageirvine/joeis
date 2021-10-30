package irvine.oeis.a052;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A052201 Equivalent of the Kurepa hypothesis for left factorial.
 * @author Sean A. Irvine
 */
public class A052201 implements Sequence {

  private Z mA = Z.FOUR;
  private Z mB = Z.valueOf(15);
  private Z mC = Z.valueOf(48);
  private long mN = 1;

  @Override
  public Z next() {
    if (++mN == 2) {
      return mA;
    } else if (mN == 3) {
      return mB;
    } else if (mN > 4) {
      final Z t = mC.subtract(mA).multiply(mN).subtract(mB.multiply(3));
      mA = mB;
      mB = mC;
      mC = t;
    }
    return mC;
  }
}
