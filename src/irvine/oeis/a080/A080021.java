package irvine.oeis.a080;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A080021 log(n) is closer to an integer than is log(m) for any m with 2&lt;=m&lt;n.
 * @author Sean A. Irvine
 */
public class A080021 extends Sequence1 {

  private long mN = 1;
  private CR mBest = CR.ONE;

  @Override
  public Z next() {
    while (true) {
      final CR log = CR.valueOf(++mN).log();
      final CR d = log.subtract(log.round()).abs();
      if (d.compareTo(mBest) < 0) {
        mBest = d;
        return Z.valueOf(mN);
      }
    }
  }
}
