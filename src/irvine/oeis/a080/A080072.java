package irvine.oeis.a080;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A080072 Values of n such that Pi^n is farther from its closest integer than any Pi^k for 1 &lt;= k &lt; n.
 * @author Sean A. Irvine
 */
public class A080072 extends Sequence1 {

  private CR mBest = CR.ZERO;
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final CR f = CR.PI.pow(++mN).frac();
      final CR m = f.min(CR.ONE.subtract(f));
      if (m.compareTo(mBest) > 0) {
        mBest = m;
        return Z.valueOf(mN);
      }
    }
  }
}

