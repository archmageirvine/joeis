package irvine.oeis.a393;

import irvine.math.cr.CR;
import irvine.math.polynomial.HermitePolynomials;
import irvine.oeis.cons.PolynomialRootExpansionSequence;

/**
 * A393368 allocated for A.H.M. Smeets.
 * @author Sean A. Irvine
 */
public class A393368 extends PolynomialRootExpansionSequence {

  /** Construct the sequence. */
  public A393368() {
    super(0, new HermitePolynomials().getValue(7), CR.ZERO, CR.ONE);
  }
}

