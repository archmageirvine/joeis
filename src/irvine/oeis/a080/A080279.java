package irvine.oeis.a080;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a006.A006752;

/**
 * A080279 Numbers n such that 1/G^n is closer to its nearest integer than any value of 1/G^k for 1 &lt;= k &lt; n, where G is Catalan's constant.
 * @author Sean A. Irvine
 */
public class A080279 extends Sequence1 {

  private static final CR INV_G = new A006752().getCR().inverse();
  private CR mBest = CR.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final CR f = INV_G.pow(++mN).frac();
      final CR m = f.min(CR.ONE.subtract(f));
      if (m.compareTo(mBest) < 0) {
        mBest = m;
        return Z.valueOf(mN);
      }
    }
  }
}

