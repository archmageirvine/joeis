package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.oeis.a016.A016789;

/**
 * A051540 Least common multiple of {2, 5, 8, 11, 14, ..., 3n+2} (A016789).
 * @author Sean A. Irvine
 */
public class A051540 extends A016789 {

  private Z mLcm = Z.ONE;

  @Override
  public Z next() {
    mLcm = mLcm.lcm(super.next());
    return mLcm;
  }
}
