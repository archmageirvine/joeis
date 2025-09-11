package irvine.oeis.a080;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A080281 Numbers k such that Pi^k - 1/phi is closer to its nearest integer than any value of Pi^j - 1/phi for 1 &lt;= j &lt; k.
 * @author Sean A. Irvine
 */
public class A080281 extends Sequence1 {

  private static final CR INVERSE_PHI = CR.PHI.inverse();
  private CR mBest = CR.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final CR f = CR.PI.pow(++mN).subtract(INVERSE_PHI).frac();
      final CR m = f.min(CR.ONE.subtract(f));
      if (m.compareTo(mBest) < 0) {
        mBest = m;
        return Z.valueOf(mN);
      }
    }
  }
}

