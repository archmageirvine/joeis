package irvine.oeis.a038;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A038469 Sums of 7 distinct powers of 3.
 * @author Sean A. Irvine
 */
public class A038469 extends Sequence1 {

  private Z mN = null;

  @Override
  public Z next() {
    mN = mN == null ? Z.valueOf(127) : ZUtils.swizzle(mN);
    return new Z(mN.toString(2), 3);
  }
}
