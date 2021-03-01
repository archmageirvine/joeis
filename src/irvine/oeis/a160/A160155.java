package irvine.oeis.a160;

import irvine.math.cr.CR;
import irvine.math.cr.ZPolynomial;
import irvine.math.polynomial.Polynomial;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A160155 Decimal expansion of the one real root of x^5-x-1.
 * @author Sean A. Irvine
 */
public class A160155 extends DecimalExpansionSequence {

  private static final CR ROOT = new ZPolynomial(Polynomial.create(-1, -1, 0, 0, 0, 1)).inverseMonotone(CR.ONE, CR.TWO).execute(CR.ZERO);

  @Override
  protected CR getCR() {
    return ROOT;
  }
}
