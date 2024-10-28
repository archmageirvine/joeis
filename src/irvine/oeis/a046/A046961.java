package irvine.oeis.a046;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A046961 Bessel function Y_0(n) is a monotonically decreasing positive sequence.
 * @author Sean A. Irvine
 */
public class A046961 extends Sequence0 {

  private CR mBest = CR.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      CR cr = CR.valueOf(++mN);
      final CR y0 = CrFunctions.BESSEL_Y0.cr(cr);
      if (y0.signum() > 0 && y0.compareTo(mBest) < 0) {
        mBest = y0;
        return Z.valueOf(mN);
      }
    }
  }
}
