package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A003471 Number of permutations with no hits on 2 main diagonals.
 * @author Sean A. Irvine
 */
public class A003471 extends Sequence0 {

  private long mN = -1;
  private Z mA = Z.ONE;
  private Z mB = Z.ZERO;
  private Z mC = Z.ZERO;
  private Z mD = Z.ZERO;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    } else if (mN > 3) {
      final boolean even = (mN & 1) == 0;
      final Z t = mD.multiply(mN - 1).add((even ? mA : mC).multiply(mN - (even ? 2 : 1)).multiply2());
      mA = mB;
      mB = mC;
      mC = mD;
      mD = t;
    }
    return mD;
  }
}

