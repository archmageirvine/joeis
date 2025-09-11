package irvine.oeis.a080;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A080282 Numbers n such that log(n) + log_10(n) is closer to its nearest integer than any value of log(k) + log_10(k) for 1 &lt; = k &lt; n.
 * @author Sean A. Irvine
 */
public class A080282 extends Sequence1 {

  private CR mBest = CR.ONE;
  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      final CR n = CR.valueOf(++mN);
      final CR f = n.log().add(n.log10()).frac();
      final CR m = f.min(CR.ONE.subtract(f));
      if (m.compareTo(mBest) < 0) {
        mBest = m;
        return Z.valueOf(mN);
      }
    }
  }
}

