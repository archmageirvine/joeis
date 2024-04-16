package irvine.oeis.a038;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A038463 Sums of 12 distinct powers of 2.
 * @author Sean A. Irvine
 */
public class A038463 extends Sequence1 {

  private Z mN = null;

  @Override
  public Z next() {
    mN = mN == null ? Z.valueOf(4095) : Functions.SWIZZLE.z(mN);
    return mN;
  }
}
