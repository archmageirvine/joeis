package irvine.oeis.a394;

import irvine.math.cr.CR;
import irvine.math.polynomial.Polynomial;
import irvine.oeis.cons.PolynomialRootExpansionSequence;

/**
 * A394046 allocated for A.H.M. Smeets.
 * @author Sean A. Irvine
 */
public class A394046 extends PolynomialRootExpansionSequence {

  /** Construct the sequence. */
  public A394046() {
    super(Polynomial.create(-1, -2, -5, -4, 1), CR.FIVE, CR.SIX);
  }
}
