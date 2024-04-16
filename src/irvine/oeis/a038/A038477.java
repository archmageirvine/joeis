package irvine.oeis.a038;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A038477 Sums of 5 distinct powers of 5.
 * @author Sean A. Irvine
 */
public class A038477 extends Sequence1 {

  private Z mN = null;

  @Override
  public Z next() {
    mN = mN == null ? Z.valueOf(31) : Functions.SWIZZLE.z(mN);
    return new Z(mN.toString(2), 5);
  }
}
