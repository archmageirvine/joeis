package irvine.oeis.a058;

import irvine.math.z.Z;

/**
 * A058086 Coefficients of m\u00e9nage hit polynomials.
 * @author Sean A. Irvine
 */
public class A058086 extends A058057 {

  private int mN = 5;

  @Override
  public Z next() {
    return t(++mN, mN - 6);
  }
}

