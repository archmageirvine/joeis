package irvine.oeis.a038;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence0;

/**
 * A038481 Sums of 2 distinct powers of 7.
 * @author Sean A. Irvine
 */
public class A038481 extends Sequence0 {

  private Z mN = null;

  @Override
  public Z next() {
    mN = mN == null ? Z.THREE : ZUtils.swizzle(mN);
    return new Z(mN.toString(2), 7);
  }
}
