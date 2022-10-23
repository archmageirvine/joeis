package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A001819 Central factorial numbers: second right-hand column of triangle A008955.
 * @author Sean A. Irvine
 */
public class A001819 extends Sequence0 {

  private long mN = -1;
  private Z mA = Z.ZERO;
  private Z mB = Z.ONE;

  @Override
  public Z next() {
    if (++mN == 0) {
      return mA;
    } else if (mN > 1) {
      final Z t = Z.valueOf(mN).square().multiply2().subtract(2 * mN - 1).multiply(mB)
        .subtract(Z.valueOf(mN - 1).pow(4).multiply(mA));
      mA = mB;
      mB = t;
    }
    return mB;
  }
}
