package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.a084.A084894;

/**
 * A006967 Number of graceful permutations of length n.
 * @author Sean A. Irvine
 */
public class A006967 extends A084894 {

  private Z mF = Z.ONE;
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    mF = mF.multiply(mN);
    return mF.subtract(super.next());
  }
}
