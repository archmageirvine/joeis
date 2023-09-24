package irvine.oeis.a065;

import irvine.math.z.Z;

/**
 * A065943 Triangle of coefficients of Bessel polynomials {y_n(x)}''.
 * @author Sean A. Irvine
 */
public class A065943 extends A065931 {

  private int mN = 0;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM >= mN) {
      ++mN;
      mM = 0;
    }
    return t(mN + 1, mM);
  }
}
