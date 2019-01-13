package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.a084.A084894;

/**
 * A006967.
 * @author Sean A. Irvine
 */
public class A006967 extends A084894 {

  private Z mF = Z.ONE;
  private int mN = 0;

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    return mF.subtract(super.next());
  }
}
