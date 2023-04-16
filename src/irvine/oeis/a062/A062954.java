package irvine.oeis.a062;

import irvine.math.z.Z;
import irvine.oeis.a000.A000032;

/**
 * A062954 Least common multiple of Lucas numbers L(0), L(1), ..., L(n).
 * @author Sean A. Irvine
 */
public class A062954 extends A000032 {

  private Z mLcm = Z.ONE;

  @Override
  public Z next() {
    mLcm = mLcm.lcm(super.next());
    return mLcm;
  }
}

