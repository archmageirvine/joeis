package irvine.oeis.a038;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A038446 Sums of 4 distinct powers of 10.
 * @author Sean A. Irvine
 */
public class A038446 implements Sequence {

  private Z mN = null;

  @Override
  public Z next() {
    mN = mN == null ? Z.valueOf(15) : ZUtils.swizzle(mN);
    return new Z(mN.toString(2));
  }
}
