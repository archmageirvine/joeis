package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.oeis.a016.A016813;

/**
 * A051539 a(n) = least common multiple of {1, 5, 9, 13, 17 ..., 4n+1} (A016813).
 * @author Sean A. Irvine
 */
public class A051539 extends A016813 {

  private Z mLcm = Z.ONE;

  @Override
  public Z next() {
    mLcm = mLcm.lcm(super.next());
    return mLcm;
  }
}
