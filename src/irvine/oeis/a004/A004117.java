package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A004117 Numerators of expansion of (1-x)^(-1/3).
 * @author Sean A. Irvine
 */
public class A004117 extends Sequence0 {

  private long mN = -1;
  private Z mF = Z.ONE;
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    if (++mN >= 1) {
      mF = mF.multiply(mN);
      mA = mA.multiply(3 * mN - 2);
      long u = mN;
      while (u % 3 == 0) {
        mA = mA.multiply(3);
        u /= 3;
      }
    }
    return mA.divide(mF);
  }
}
