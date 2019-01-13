package irvine.oeis.a007;

import irvine.math.z.Z;

/**
 * A007974.
 * @author Sean A. Irvine
 */
public class A007974 extends A007975 {

  @Override
  protected int start() {
    return 2;
  }

  @Override
  public Z next() {
    init();
    for (int k = 0; k < mN - 3; ++k) {
      step();
    }
    return Z.valueOf(mPrev.size());
  }
}
