package irvine.oeis.a393;

import irvine.math.cr.CR;
import irvine.math.polynomial.HermitePolynomials;
import irvine.oeis.cons.PolynomialRootExpansionSequence;

/**
 * A393362 Decimal expansion of the smallest positive zero of the Hermite polynomial of degree 6.
 * @author Sean A. Irvine
 */
public class A393362 extends PolynomialRootExpansionSequence {

  /** Construct the sequence. */
  public A393362() {
    super(0, new HermitePolynomials().getValue(6), CR.ZERO, CR.ONE);
  }
}

