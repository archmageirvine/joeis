package irvine.oeis.a393;

import irvine.math.cr.CR;
import irvine.math.polynomial.Polynomial;
import irvine.oeis.cons.PolynomialRootExpansionSequence;

/**
 * A393039 allocated for Artur Jasinski.
 * @author Sean A. Irvine
 */
public class A393039 extends PolynomialRootExpansionSequence {

  /** Construct the sequence. */
  public A393039() {
    super(1, Polynomial.create(1, -3, 3, -3, 1), CR.TWO, CR.THREE);
  }
}
