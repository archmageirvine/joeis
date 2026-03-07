package irvine.oeis.a393;

import irvine.math.cr.CR;
import irvine.math.polynomial.Polynomial;
import irvine.oeis.cons.DecimalExpansionSequence;
import irvine.oeis.cons.PolynomialRootExpansionSequence;

/**
 * A393367 allocated for A.H.M. Smeets.
 * @author Sean A. Irvine
 */
public class A393367 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A393367() {
    super(1, new PolynomialRootExpansionSequence(Polynomial.create(-1, 405, -5400, 10800), CR.ZERO, CR.valueOf(0.004)).getCR().multiply(CR.SQRT_PI));
  }
}

