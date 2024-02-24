package irvine.oeis.a068;

import irvine.math.Mobius;
import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A068545.
 * @author Sean A. Irvine
 */
public class A068576 extends Sequence1 {

  private static final CR PI2 = CR.PI.square();
  private long mN = 0;
  private long mSum = 0;

  @Override
  public Z next() {
    while (true) {
      final int m = Mobius.mobius(++mN);
      mSum += m * m;
      if (mSum == CR.valueOf(6 * mN).divide(PI2).floor().longValueExact()) {
        return Z.valueOf(mN);
      }
    }
  }
}
