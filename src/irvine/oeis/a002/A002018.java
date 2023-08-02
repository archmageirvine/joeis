package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.a000.A000681;

/**
 * A002018 From a distribution problem.
 * @author Sean A. Irvine
 */
public class A002018 extends A000681 {

  private int mN = -1;
  private Z mPrev = Z.ONE;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    final Z t = super.next();
    final Z r = t.multiply(2L * mN - 1).subtract(mPrev.multiply(mN - 1).multiply(mN - 1));
    mPrev = t;
    return r.multiply(mN);
  }
}
