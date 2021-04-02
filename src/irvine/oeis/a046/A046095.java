package irvine.oeis.a046;

import irvine.math.cr.CR;
import irvine.math.cr.ZPolynomial;
import irvine.math.polynomial.Polynomial;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A046095 Decimal expansion of Calabi's constant.
 * @author Sean A. Irvine
 */
public class A046095 extends DecimalExpansionSequence {

  // This is a nice example of finding roots of a polynomial using computable reals.

  private static final ZPolynomial POLY = new ZPolynomial(Polynomial.create(2, -3, -2, 2));
  private static final CR N = POLY.inverseMonotone(CR.ONE, CR.TWO).execute(CR.ZERO);

  @Override
  protected CR getCR() {
    return N;
  }
}

