package irvine.oeis.a086;

import irvine.math.cr.CR;
import irvine.math.polynomial.Polynomial;
import irvine.oeis.cons.PolynomialRootExpansionSequence;

/**
 * A086181 Decimal expansion of the bifurcation point B_3, the onset of an 8-cycle in the logistic equation.
 * @author Sean A. Irvine
 */
public class A086181 extends PolynomialRootExpansionSequence {

  /** Construct the sequence. */
  public A086181() {
    super(0, Polynomial.create(4913, 0, 2108, -604, -977, 8, 44, 392, -193, -40, 48, -12, 1), CR.THREE, CR.valueOf(3.6));
  }
}

