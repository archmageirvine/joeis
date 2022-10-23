package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A002777 Restricted permutations.
 * @author Sean A. Irvine
 */
public class A002777 extends Sequence0 {

  private long mN = -1;
  private Z mA = Z.ZERO;
  private Z mB = Z.ZERO;
  private Z mC = Z.FOUR;

  @Override
  public Z next() {
    if (++mN < 4) {
      return mN == 0 ? Z.ONE : Z.ZERO;
    }
    if (mN > 4) {
      final Z t = mC.multiply(mN - 1).add(((mN & 1) == 0 ? mA.multiply(mN - 2) : mB.multiply(mN - 1)).multiply2());
      mA = mB;
      mB = mC;
      mC = t;
    }
    return mC;
  }
}
