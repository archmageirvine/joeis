package irvine.oeis.a036;

import irvine.math.z.Z;

/**
 * A036609 Number of 4-ary rooted trees with n nodes and height at most 4.
 * @author Sean A. Irvine
 */
public class A036609 extends A036606 {

  {
    for (int k = 0; k <= 4; ++k) {
      step();
    }
  }

  @Override
  public Z next() {
    return mM >= mA.degree() ? null : mA.coeff(mM++).toZ();
  }
}
