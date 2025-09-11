package irvine.oeis.a080;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A080286 Numbers m such that (Pi+e)^m is closer to its nearest integer than any value of (Pi+e)^k for 1 &lt;= k &lt; m.
 * @author Sean A. Irvine
 */
public class A080286 extends Sequence1 {

  private static final CR C = CR.PI.add(CR.E);
  private CR mBest = CR.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final CR f = C.pow(++mN).frac();
      final CR m = f.min(CR.ONE.subtract(f));
      if (m.compareTo(mBest) < 0) {
        mBest = m;
        return Z.valueOf(mN);
      }
    }
  }
}

