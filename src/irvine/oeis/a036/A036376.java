package irvine.oeis.a036;

import irvine.math.z.Z;

/**
 * A036376 Number of ternary rooted trees with n nodes and height at most 8.
 * @author Sean A. Irvine
 */
public class A036376 extends A036370 {

  {
    for (int k = 1; k <= 8; ++k) {
      step();
    }
  }

  private int mN = -1;

  @Override
  public Z next() {
    if (++mN > mT.degree()) {
      return null;
    }
    return mT.coeff(mN);
  }
}
