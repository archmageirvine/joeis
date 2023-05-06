package irvine.oeis.a063;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A063674 Numerators of increasingly better rational approximations to Pi with increasing denominators (3/1, 13/4, 16/5, 19/6, 22/7, 179/57, ...).
 * @author Sean A. Irvine
 */
public class A063674 extends Sequence1 {

  private static final int ACCURACY = -1000;
  private CR mBest = CR.PI;
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final CR t = CR.valueOf(CR.PI.multiply(++mN).round()).divide(CR.valueOf(mN)).subtract(CR.PI).abs();
      if (t.compareTo(mBest, ACCURACY) < 0) {
        mBest = t;
        return CR.PI.multiply(mN).round();
      }
    }
  }
}
