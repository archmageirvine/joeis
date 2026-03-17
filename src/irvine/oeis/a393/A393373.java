package irvine.oeis.a393;

import irvine.math.cr.CR;
import irvine.math.polynomial.Polynomial;
import irvine.oeis.cons.DecimalExpansionSequence;
import irvine.oeis.cons.PolynomialRootExpansionSequence;

/**
 * A393373 allocated for A.H.M. Smeets.
 * @author Sean A. Irvine
 */
public class A393373 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A393373() {
    super(0, CR.SQRT_PI.multiply(new PolynomialRootExpansionSequence(Polynomial.create(-5, 9303, -335160, 1234800), CR.valueOf(0.01), CR.valueOf(0.2)).getCR()));
  }
}
