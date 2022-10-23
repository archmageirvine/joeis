package irvine.oeis.a058;

import irvine.math.polynomial.GandhiPolynomials;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A058942 Triangle of coefficients of Gandhi polynomials.
 * @author Sean A. Irvine
 */
public class A058942 extends Sequence1 {

  private final GandhiPolynomials mGandhiPolynomials = new GandhiPolynomials();
  private int mN = 0;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM >= mN) {
      ++mN;
      mM = 0;
    }
    return mGandhiPolynomials.getValue(mN).coeff(mM);
  }
}
