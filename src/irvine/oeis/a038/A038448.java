package irvine.oeis.a038;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A038448 Sums of 6 distinct powers of 10.
 * @author Sean A. Irvine
 */
public class A038448 extends Sequence1 {

  private Z mN = null;

  @Override
  public Z next() {
    mN = mN == null ? Z.valueOf(63) : Functions.SWIZZLE.z(mN);
    return new Z(mN.toString(2));
  }
}
