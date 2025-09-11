package irvine.oeis.a080;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A080285 Numbers n such that [(Pi+e)/(Pi-e)]^n is closer to its nearest integer than any value of [(Pi+e)/(Pi-e)]^k for 1 &lt;= k &lt; n.
 * @author Sean A. Irvine
 */
public class A080285 extends Sequence1 {

  private static final CR C = CR.PI.add(CR.E).divide(CR.PI.subtract(CR.E));
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

