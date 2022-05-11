package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.oeis.a024.A024619;

/**
 * A056835 a(n) = lcm(s(1),...,s(n)) where {s(n)} = A024619 and a(0) = 1.
 * @author Sean A. Irvine
 */
public class A056835 extends A024619 {

  private Z mLcm = null;

  @Override
  public Z next() {
    mLcm = mLcm == null ? Z.ONE : mLcm.lcm(super.next());
    return mLcm;
  }
}
