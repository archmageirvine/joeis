package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.oeis.a000.A000005;

/**
 * A051548 a(n) = LCM { tau(1), ..., tau(n) }, a(0) = 1.
 * @author Sean A. Irvine
 */
public class A051548 extends A000005 {

  private Z mLcm = null;

  @Override
  public Z next() {
    mLcm = mLcm == null ? Z.ONE : mLcm.lcm(super.next());
    return mLcm;
  }
}
