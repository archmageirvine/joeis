package irvine.oeis.a058;

import irvine.math.z.Z;

/**
 * A058405 Coefficient triangle of polynomials (falling powers) related to Pell number convolutions. Companion triangle is A058404.
 * @author Sean A. Irvine
 */
public class A058405 extends A058402 {

  @Override
  public Z next() {
    super.next();
    return mQ.coeff(mQ.degree() - mM);
  }
}

