package irvine.oeis.a032;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A032261 Number of bracelets with n labeled beads of 3 colors.
 * @author Sean A. Irvine
 */
public class A032261 extends Sequence0 {

  private Z mA = Z.ONE;
  private long mN = -1;

  @Override
  public Z next() {
    if (++mN > 0) {
      mA = mA.multiply(3);
      if (mN > 3) {
        mA = mA.multiply(mN - 1);
      }
    }
    return mA;
  }
}
