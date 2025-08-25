package irvine.oeis.a079;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A079618.
 * @author Sean A. Irvine
 */
public class A079663 extends Sequence1 {

  private CR mMin = null;
  private long mN = 1;

  @Override
  public Z next() {
    if (mMin == null) {
      mMin = CR.ONE;
      return Z.ONE;
    }
    while (true) {
      if (++mN == 2) {
        return Z.TWO;
      }
      final CR n = CR.valueOf(mN);
      final CR log = CR.valueOf(mN).log();
      final CR t = n.pow(new Q(1, log.floor())).subtract(CR.E).min(CR.E.subtract(n.pow(new Q(1, log.ceil()))));
      if (t.compareTo(mMin) < 0) {
        mMin = t;
        return Z.valueOf(mN);
      }
    }
  }
}

