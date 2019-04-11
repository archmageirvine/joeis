package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003418 Least common multiple (or LCM) of <code>{1, 2, </code>..., <code>n}</code> for <code>n &gt;= 1, a(0) = 1</code>.
 * @author Sean A. Irvine
 */
public class A003418 implements Sequence {

  private long mN = -1;
  private Z mLcm = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 0) {
      mLcm = mLcm.lcm(Z.valueOf(mN));
    }
    return mLcm;
  }
}
