package irvine.oeis.a058;

import irvine.math.z.Z;

/**
 * A058090 Coefficients of m\u00e9nage hit polynomials.
 * @author Sean A. Irvine
 */
public class A058090 extends A058087 {

  private int mN = 6;

  @Override
  public Z next() {
    return t(++mN, mN - 7);
  }
}

