package irvine.oeis.a038;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A038488 Sums of 3 distinct powers of 9.
 * @author Sean A. Irvine
 */
public class A038488 implements Sequence {

  private Z mN = null;

  @Override
  public Z next() {
    mN = mN == null ? Z.SEVEN : ZUtils.swizzle(mN);
    return new Z(mN.toString(2), 9);
  }
}
