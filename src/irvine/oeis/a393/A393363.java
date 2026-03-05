package irvine.oeis.a393;

import irvine.math.cr.CR;
import irvine.math.polynomial.HermitePolynomials;
import irvine.oeis.cons.PolynomialRootExpansionSequence;

/**
 * A393363 Decimal expansion of the second smallest positive zero of the Hermite polynomial of degree 6.
 * @author Sean A. Irvine
 */
public class A393363 extends PolynomialRootExpansionSequence {

  /** Construct the sequence. */
  public A393363() {
    super(1, new HermitePolynomials().getValue(6), CR.ONE, CR.TWO);
  }
}

