package irvine.oeis.a038;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A038452 Sums of 10 distinct powers of 10.
 * @author Sean A. Irvine
 */
public class A038452 extends Sequence1 {

  private Z mN = null;

  @Override
  public Z next() {
    mN = mN == null ? Z.valueOf(1023) : ZUtils.swizzle(mN);
    return new Z(mN.toString(2));
  }
}
