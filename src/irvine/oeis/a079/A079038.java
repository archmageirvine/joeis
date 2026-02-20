package irvine.oeis.a079;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A079038 Fractional part of sinh(n) decreases monotonically to zero.
 * @author Sean A. Irvine
 */
public class A079038 extends Sequence0 {

  private CR mBest = CR.TWO;
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final CR sinh = ComputableReals.SINGLETON.sinh(CR.valueOf(++mN)).frac();
      if (sinh.compareTo(mBest) < 0) {
        mBest = sinh;
        return Z.valueOf(mN);
      }
    }
  }
}
