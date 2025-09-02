package irvine.oeis.a080;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A080053 Exp(n) is further from an integer than any previous exp(k) for 1 &lt;= k &lt; n.
 * @author Sean A. Irvine
 */
public class A080053 extends Sequence1 {

  private CR mBest = CR.ZERO;
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final CR f = CR.valueOf(++mN).exp().frac();
      final CR m = f.min(CR.ONE.subtract(f));
      if (m.compareTo(mBest) > 0) {
        mBest = m;
        return Z.valueOf(mN);
      }
    }
  }
}

