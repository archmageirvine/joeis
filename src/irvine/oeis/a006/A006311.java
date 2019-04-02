package irvine.oeis.a006;

import irvine.math.z.Z;

/**
 * A006311 Coefficients of period polynomials.
 * @author Sean A. Irvine
 */
public class A006311 extends A006308 {

  @Override
  protected int coeffNumber() {
    return 1;
  }

  @Override
  protected Z sign(final Z n) {
    return n;
  }
}

