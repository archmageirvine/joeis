package irvine.oeis.a058;

import irvine.math.cr.CR;
import irvine.math.cr.ZPolynomial;
import irvine.math.polynomial.Polynomial;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A058265.
 * @author Sean A. Irvine
 */
public class A058265 extends DecimalExpansionSequence {

  // This is a nice example of finding roots of a polynomial using computable reals.

  private static final ZPolynomial POLY = new ZPolynomial(Polynomial.create(-1, -1, -1, 1));
  private static final CR N = POLY.inverseMonotone(CR.ONE, CR.TWO).execute(CR.ZERO);

  @Override
  protected CR getCR() {
    return N;
  }
}

