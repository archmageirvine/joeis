package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.a000.A000058;

/**
 * A006281 Partial quotients in continued fraction expansion of <code>2C-1</code>, where C is Cahen's constant.
 * @author Sean A. Irvine
 */
public class A006281 extends A000058 {

  private int mN = -1;
  private Z mH = Z.ONE;

  {
    super.next();
  }

  @Override
  public Z next() {
    if (mN < 1) {
      return ++mN == 0 ? Z.ZERO : Z.THREE;
    }
    mH = super.next().subtract(1).divide2().divide(mH);
    return mH.square().multiply2();
  }
}
