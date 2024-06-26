package irvine.oeis.a038;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A038490 Sums of 2 distinct powers of 11.
 * @author Sean A. Irvine
 */
public class A038490 extends Sequence1 {

  private Z mN = null;

  @Override
  public Z next() {
    mN = mN == null ? Z.THREE : Functions.SWIZZLE.z(mN);
    return new Z(mN.toString(2), 11);
  }
}
