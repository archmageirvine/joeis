package irvine.oeis.a080;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A080283 Numbers n such that (log(n)/Pi)^2 is closer to its nearest integer than any value of (log(k)/Pi)^2 for 1 &lt;= k &lt; n.
 * @author Sean A. Irvine
 */
public class A080283 extends Sequence1 {

  private static final CR PI2 = CR.PI.square();
  private CR mBest = CR.ONE;
  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      final CR n = CR.valueOf(++mN);
      final CR f = n.log().square().divide(PI2).frac();
      final CR m = f.min(CR.ONE.subtract(f));
      if (m.compareTo(mBest) < 0) {
        mBest = m;
        return Z.valueOf(mN);
      }
    }
  }
}

