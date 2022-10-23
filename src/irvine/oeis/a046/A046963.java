package irvine.oeis.a046;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A046963 Bessel function |Y_0(n)| is a monotonically decreasing positive sequence.
 * @author Sean A. Irvine
 */
public class A046963 extends Sequence0 {

  private CR mBest = CR.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final CR y0 = CR.valueOf(++mN).besselY0().abs();
      if (y0.compareTo(mBest) < 0) {
        mBest = y0;
        return Z.valueOf(mN);
      }
    }
  }
}
