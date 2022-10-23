package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A048707 Numerators of ratios converging to Thue-Morse constant.
 * @author Sean A. Irvine
 */
public class A048707 extends Sequence0 {

  private int mN = -1;
  private Z mA = Z.ZERO;

  @Override
  public Z next() {
    if (++mN > 0) {
      mA = mA.add(1).multiply(Z.ONE.shiftLeft(1 << (mN - 1)).subtract(1));
    }
    return mA;
  }
}
