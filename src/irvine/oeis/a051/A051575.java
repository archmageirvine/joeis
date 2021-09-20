package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.oeis.a000.A000108;

/**
 * A051575 a(n) = LCM { Catalan(0), ..., Catalan(n) }.
 * @author Sean A. Irvine
 */
public class A051575 extends A000108 {

  private Z mLcm = Z.ONE;

  @Override
  public Z next() {
    mLcm = mLcm.lcm(super.next());
    return mLcm;
  }
}
