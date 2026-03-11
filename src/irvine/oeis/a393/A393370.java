package irvine.oeis.a393;

import irvine.math.cr.CR;
import irvine.math.polynomial.HermitePolynomials;
import irvine.oeis.cons.PolynomialRootExpansionSequence;

/**
 * A393370 Decimal expansion of the largest positive zero of the Hermite polynomial of degree 7.
 * @author Sean A. Irvine
 */
public class A393370 extends PolynomialRootExpansionSequence {

  /** Construct the sequence. */
  public A393370() {
    super(1, new HermitePolynomials().getValue(7), CR.TWO, CR.THREE);
  }
}

