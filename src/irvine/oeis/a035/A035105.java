package irvine.oeis.a035;

import irvine.math.z.Z;
import irvine.oeis.a000.A000045;

/**
 * A035105.
 * @author Sean A. Irvine
 */
public class A035105 extends A000045 {

  {
    super.next(); // skip 0
  }
  private Z mLcm = Z.ONE;

  @Override
  public Z next() {
    mLcm = mLcm.lcm(super.next());
    return mLcm;
  }
}
