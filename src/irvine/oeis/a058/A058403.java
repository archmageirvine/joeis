package irvine.oeis.a058;

import irvine.math.z.Z;

/**
 * A058403 Coefficient triangle of polynomials (rising powers) related to Pell number convolutions. Companion triangle is A058402.
 * @author Sean A. Irvine
 */
public class A058403 extends A058402 {

  @Override
  public Z next() {
    super.next();
    return mQ.coeff(mM);
  }
}

