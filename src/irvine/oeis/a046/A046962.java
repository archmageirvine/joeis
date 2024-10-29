package irvine.oeis.a046;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A046962 Bessel function |J_0(n)| is a monotonically decreasing positive sequence.
 * @author Sean A. Irvine
 */
public class A046962 extends Sequence0 {

  private CR mBest = CR.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final CR j0 = CrFunctions.BESSEL_J0.cr(CR.valueOf(++mN)).abs();
      if (j0.compareTo(mBest) < 0) {
        mBest = j0;
        return Z.valueOf(mN);
      }
    }
  }
}
