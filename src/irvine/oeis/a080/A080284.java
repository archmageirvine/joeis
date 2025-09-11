package irvine.oeis.a080;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A080284 Numbers n such that (Pi/e)^n is closer to its nearest integer than any value of (Pi/e)^k for 1 &lt;= k &lt; n.
 * @author Sean A. Irvine
 */
public class A080284 extends Sequence1 {

  private static final CR PI_OVER_E = CR.PI.divide(CR.E);
  private CR mBest = CR.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final CR f = PI_OVER_E.pow(++mN).frac();
      final CR m = f.min(CR.ONE.subtract(f));
      if (m.compareTo(mBest) < 0) {
        mBest = m;
        return Z.valueOf(mN);
      }
    }
  }
}

