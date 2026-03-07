package irvine.oeis.a393;

import irvine.math.cr.CR;
import irvine.math.polynomial.HermitePolynomials;
import irvine.oeis.cons.PolynomialRootExpansionSequence;

/**
 * A393369 allocated for A.H.M. Smeets.
 * @author Sean A. Irvine
 */
public class A393369 extends PolynomialRootExpansionSequence {

  /** Construct the sequence. */
  public A393369() {
    super(1, new HermitePolynomials().getValue(7), CR.ONE, CR.TWO);
  }
}

