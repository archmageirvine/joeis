package irvine.oeis.a393;

import irvine.math.cr.CR;
import irvine.math.polynomial.HermitePolynomials;
import irvine.oeis.cons.PolynomialRootExpansionSequence;

/**
 * A393368 Decimal expansion of the smallest positive zero of the Hermite polynomial of degree 7.
 * @author Sean A. Irvine
 */
public class A393368 extends PolynomialRootExpansionSequence {

  /** Construct the sequence. */
  public A393368() {
    super(0, new HermitePolynomials().getValue(7), CR.ZERO, CR.ONE);
  }
}

