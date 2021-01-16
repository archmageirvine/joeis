package irvine.oeis.a038;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A038444 Sums of 2 distinct powers of 10.
 * @author Sean A. Irvine
 */
public class A038444 implements Sequence {

  private Z mN = null;

  @Override
  public Z next() {
    mN = mN == null ? Z.THREE : ZUtils.swizzle(mN);
    return new Z(mN.toString(2));
  }
}
