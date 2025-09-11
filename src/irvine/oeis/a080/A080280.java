package irvine.oeis.a080;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A080280 Numbers n such that Pi^(n*e)-e^n is closer to its nearest integer than any value of Pi^(k*e)-e^k for 1 &lt;= k &lt; n.
 * @author Sean A. Irvine
 */
public class A080280 extends Sequence1 {

  private static final CR PIE = CR.PI.pow(CR.E);
  private CR mBest = CR.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final CR f = PIE.pow(++mN).subtract(CR.E.pow(mN)).frac();
      final CR m = f.min(CR.ONE.subtract(f));
      if (m.compareTo(mBest) < 0) {
        mBest = m;
        return Z.valueOf(mN);
      }
    }
  }
}

