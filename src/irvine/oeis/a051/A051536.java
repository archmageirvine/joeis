package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.oeis.a016.A016777;

/**
 * A051536 a(n) = least common multiple of {1, 4, 7, 10, 13 ..., 3n+1} (A016777).
 * @author Sean A. Irvine
 */
public class A051536 extends A016777 {

  private Z mLcm = Z.ONE;

  @Override
  public Z next() {
    mLcm = mLcm.lcm(super.next());
    return mLcm;
  }
}
