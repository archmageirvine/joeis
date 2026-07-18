package irvine.oeis.a085;

import irvine.math.z.Z;
import irvine.oeis.a002.A002473;

/**
 * A085911 Least common multiple of the first n terms of A002473 (7-smooth numbers).
 * @author Sean A. Irvine
 */
public class A085911 extends A002473 {

  private Z mLcm = Z.ONE;

  @Override
  public Z next() {
    mLcm = mLcm.lcm(super.next());
    return mLcm;
  }
}
