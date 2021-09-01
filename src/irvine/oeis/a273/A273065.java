package irvine.oeis.a273;

import irvine.math.cr.CR;
import irvine.math.cr.ZPolynomial;
import irvine.math.polynomial.Polynomial;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A273065 Decimal expansion of the negative reciprocal of the real root of x^3 - 2x + 2.
 * Polynomial: <code>x^3-2x+2</code>
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A273065 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A273065() {
    super(-1, new ZPolynomial(Polynomial.create(2, -2, 0, 1)).inverseMonotone(CR.valueOf(-2), CR.valueOf(-1)).execute(CR.ZERO).inverse());
  }
}
