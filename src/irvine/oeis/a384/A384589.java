package irvine.oeis.a384;

import irvine.math.cr.CR;
import irvine.math.polynomial.Polynomial;
import irvine.oeis.cons.PolynomialRootExpansionSequence;

/**
 * A384589 allocated for A.H.M. Smeets.
 * @author Sean A. Irvine
 */
public class A384589 extends PolynomialRootExpansionSequence {

  /** Construct the sequence. */
  public A384589() {
    super(0, Polynomial.create(9, -16960, 504576, -1990656, 1990656), CR.ZERO, CR.valueOf(0.01));
  }
}
