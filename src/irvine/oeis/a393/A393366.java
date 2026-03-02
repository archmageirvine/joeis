package irvine.oeis.a393;

import irvine.math.cr.CR;
import irvine.math.polynomial.Polynomial;
import irvine.oeis.cons.DecimalExpansionSequence;
import irvine.oeis.cons.PolynomialRootExpansionSequence;

/**
 * A393366 allocated for A.H.M. Smeets.
 * @author Sean A. Irvine
 */
public class A393366 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A393366() {
    super(0, new PolynomialRootExpansionSequence(0, Polynomial.create(-1, 405, -5400, 10800), CR.valueOf(0.07), CR.valueOf(0.1)).getCR().multiply(CR.SQRT_PI));
  }
}
