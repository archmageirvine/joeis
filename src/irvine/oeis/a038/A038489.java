package irvine.oeis.a038;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A038489 Sums of 4 distinct powers of 9.
 * @author Sean A. Irvine
 */
public class A038489 extends Sequence1 {

  private Z mN = null;

  @Override
  public Z next() {
    mN = mN == null ? Z.valueOf(15) : Functions.SWIZZLE.z(mN);
    return new Z(mN.toString(2), 9);
  }
}
