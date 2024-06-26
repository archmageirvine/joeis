package irvine.oeis.a038;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A038484 Sums of 2 distinct powers of 8.
 * @author Sean A. Irvine
 */
public class A038484 extends Sequence1 {

  private Z mN = null;

  @Override
  public Z next() {
    mN = mN == null ? Z.THREE : Functions.SWIZZLE.z(mN);
    return new Z(mN.toString(2), 8);
  }
}
