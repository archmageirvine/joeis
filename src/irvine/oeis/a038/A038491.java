package irvine.oeis.a038;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A038491 Sums of 3 distinct powers of 11.
 * @author Sean A. Irvine
 */
public class A038491 extends Sequence0 {

  private Z mN = null;

  @Override
  public Z next() {
    mN = mN == null ? Z.SEVEN : Functions.SWIZZLE.z(mN);
    return new Z(mN.toString(2), 11);
  }
}
