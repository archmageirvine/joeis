package irvine.oeis.a393;

import irvine.math.cr.CR;
import irvine.math.polynomial.HermitePolynomials;
import irvine.oeis.cons.PolynomialRootExpansionSequence;

/**
 * A393353 Decimal expansion of the smallest positive zero of the Hermite polynomial of degree 4.
 * @author Sean A. Irvine
 */
public class A393353 extends PolynomialRootExpansionSequence {

  /** Construct the sequence. */
  public A393353() {
    super(0, new HermitePolynomials().getValue(4), CR.ZERO, CR.ONE);
  }
}

