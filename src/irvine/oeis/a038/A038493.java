package irvine.oeis.a038;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A038493 Sums of 3 distinct powers of 12.
 * @author Sean A. Irvine
 */
public class A038493 extends Sequence1 {

  private Z mN = null;

  @Override
  public Z next() {
    mN = mN == null ? Z.SEVEN : ZUtils.swizzle(mN);
    return new Z(mN.toString(2), 12);
  }
}
