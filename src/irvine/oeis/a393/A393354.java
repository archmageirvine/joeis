package irvine.oeis.a393;

import irvine.math.cr.CR;
import irvine.math.polynomial.HermitePolynomials;
import irvine.oeis.cons.PolynomialRootExpansionSequence;

/**
 * A393354 Decimal expansion of the largest positive zero of the Hermite polynomial of degree 4.
 * @author Sean A. Irvine
 */
public class A393354 extends PolynomialRootExpansionSequence {

  /** Construct the sequence. */
  public A393354() {
    super(1, new HermitePolynomials().getValue(4), CR.ONE, CR.TWO);
  }
}

