package irvine.oeis.a036;

import irvine.math.z.Z;

/**
 * A036621 Number of 6-ary rooted trees with n nodes and height at most 4.
 * @author Sean A. Irvine
 */
public class A036621 extends A036606 {

  {
    for (int k = 0; k <= 4; ++k) {
      step();
    }
  }

  @Override
  protected int ary() {
    return 6;
  }

  @Override
  public Z next() {
    return mM >= mA.degree() ? null : mA.coeff(mM++).toZ();
  }
}
