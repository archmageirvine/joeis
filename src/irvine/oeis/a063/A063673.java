package irvine.oeis.a063;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A063673 Denominators of convergents to Pi by Farey fractions.
 * @author Sean A. Irvine
 */
public class A063673 extends Sequence1 {

  private static final int ACCURACY = -1000;
  private CR mBest = CR.PI;
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final CR t = CR.valueOf(CR.PI.multiply(++mN).round()).divide(CR.valueOf(mN)).subtract(CR.PI).abs();
      if (t.compareTo(mBest, ACCURACY) < 0) {
        mBest = t;
        return Z.valueOf(mN);
      }
    }
  }
}

