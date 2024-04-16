package irvine.oeis.a038;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A038445 Sums of 3 distinct powers of 10.
 * @author Sean A. Irvine
 */
public class A038445 extends Sequence1 {

  private Z mN = null;

  @Override
  public Z next() {
    mN = mN == null ? Z.SEVEN : Functions.SWIZZLE.z(mN);
    return new Z(mN.toString(2));
  }
}
