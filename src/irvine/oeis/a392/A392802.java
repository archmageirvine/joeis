package irvine.oeis.a392;

import irvine.math.cr.CR;
import irvine.math.polynomial.Polynomial;
import irvine.oeis.cons.PolynomialRootExpansionSequence;

/**
 * A392802 allocated for Artur Jasinski.
 * @author Sean A. Irvine
 */
public class A392802 extends PolynomialRootExpansionSequence {

  /** Construct the sequence. */
  public A392802() {
    super(1, Polynomial.create(1, -1, -1, -2, 1), CR.TWO, CR.THREE);
  }
}
