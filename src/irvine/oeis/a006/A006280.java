package irvine.oeis.a006;

import irvine.math.z.Z;

/**
 * A006280 Partial quotients in continued fraction expansion of Cahen's constant.
 * @author Sean A. Irvine
 */
public class A006280 extends A006279 {

  private int mN = -1;

  @Override
  public Z next() {
    return mN < 1 ? Z.valueOf(++mN) : super.next().square();
  }
}
