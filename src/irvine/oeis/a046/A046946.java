package irvine.oeis.a046;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A046946 Sin(n) decreases monotonically to 0.
 * @author Sean A. Irvine
 */
public class A046946 extends Sequence0 {

  private CR mBest = CR.TWO;
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final CR sin = CR.valueOf(++mN).sin();
      if (sin.signum() > 0 && sin.compareTo(mBest) < 0) {
        mBest = sin;
        return Z.valueOf(mN);
      }
    }
  }
}
