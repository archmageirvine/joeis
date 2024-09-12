package irvine.oeis.a072;

import irvine.math.cr.CR;
import irvine.math.polynomial.Polynomial;
import irvine.oeis.cons.PolynomialRootExpansionSequence;

/**
 * A060007.
 * @author Sean A. Irvine
 */
public class A072223 extends PolynomialRootExpansionSequence {

  /** Construct the sequence. */
  public A072223() {
    super(0, Polynomial.create(1, -1, -2, 0, 1), CR.ZERO, CR.ONE);
  }
}
