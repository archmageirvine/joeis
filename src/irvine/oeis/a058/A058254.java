package irvine.oeis.a058;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A058254 a(n) = lcm{prime(i)-1, i=1..n}.
 * @author Sean A. Irvine
 */
public class A058254 extends A000040 {

  private Z mLcm = null;

  @Override
  public Z next() {
    mLcm = mLcm == null ? Z.ONE : mLcm.lcm(super.next().subtract(1));
    return mLcm;
  }
}
