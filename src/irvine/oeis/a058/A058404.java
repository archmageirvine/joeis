package irvine.oeis.a058;

import irvine.math.z.Z;

/**
 * A058404 Coefficient triangle of polynomials (falling powers) related to Pell number convolutions. Companion triangle is A058405.
 * @author Sean A. Irvine
 */
public class A058404 extends A058402 {

  @Override
  public Z next() {
    super.next();
    return mP.coeff(mP.degree() - mM);
  }
}

