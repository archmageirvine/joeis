package irvine.oeis.a079;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A079039 Fractional part of cosh(n) decreases monotonically to zero.
 * @author Sean A. Irvine
 */
public class A079039 extends Sequence1 {

  private CR mBest = CR.TWO;
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final CR cosh = ComputableReals.SINGLETON.cosh(CR.valueOf(++mN)).frac();
      if (cosh.compareTo(mBest) < 0) {
        mBest = cosh;
        return Z.valueOf(mN);
      }
    }
  }
}
