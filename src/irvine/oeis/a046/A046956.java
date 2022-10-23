package irvine.oeis.a046;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A046956 Numbers k where tan(k) decreases monotonically to 0 (or cot(k) increases).
 * @author Sean A. Irvine
 */
public class A046956 extends Sequence0 {

  private CR mBest = CR.TWO;
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final CR tan = ComputableReals.SINGLETON.tan(CR.valueOf(++mN));
      if (tan.signum() > 0 && tan.compareTo(mBest) < 0) {
        mBest = tan;
        return Z.valueOf(mN);
      }
    }
  }
}
