package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A003418 Least common multiple (or LCM) of {1, 2, ..., n} for n &gt;= 1, a(0) = 1.
 * @author Sean A. Irvine
 */
public class A003418 extends Sequence0 {

  protected long mN = -1;
  private Z mLcm = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 0) {
      mLcm = mLcm.lcm(Z.valueOf(mN));
    }
    return mLcm;
  }
}
