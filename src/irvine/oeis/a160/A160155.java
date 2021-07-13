package irvine.oeis.a160;

import irvine.math.cr.CR;
import irvine.math.polynomial.Polynomial;
import irvine.oeis.PolynomialRootExpansionSequence;

/**
 * A160155 Decimal expansion of the one real root of x^5-x-1.
 * @author Sean A. Irvine
 */
public class A160155 extends PolynomialRootExpansionSequence {

  /** Construct the sequence. */
  public A160155() {
    super(Polynomial.create(-1, -1, 0, 0, 0, 1), CR.ONE, CR.TWO);
  }
}
