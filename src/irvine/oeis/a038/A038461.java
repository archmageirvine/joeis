package irvine.oeis.a038;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A038461 Sums of 10 distinct powers of 2.
 * @author Sean A. Irvine
 */
public class A038461 extends Sequence1 {

  private Z mN = null;

  @Override
  public Z next() {
    mN = mN == null ? Z.valueOf(1023) : ZUtils.swizzle(mN);
    return mN;
  }
}
