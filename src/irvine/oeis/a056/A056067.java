package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A056067 Numbers k such that k! is divisible by the square of (f+d)!^2 for d=0 and d=1 (and possibly larger d), where f = floor(k/2).
 * @author Sean A. Irvine
 */
public class A056067 extends Sequence1 {

  private int mN = 0;
  private Z mF = Z.ONE;
  private Z mG = Z.ONE;

  @Override
  public Z next() {
    while (true) {
      mF = mF.multiply(++mN);
      if ((mN & 1) == 0) {
        mG = mG.multiply(mN / 2).multiply(mN / 2);
      }
      if (mF.mod(mG.multiply(mN / 2 + 1).multiply(mN / 2 + 1)).isZero()) {
        return Z.valueOf(mN);
      }
    }
  }
}
