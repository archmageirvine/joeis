package irvine.oeis.a393;

import irvine.math.cr.CR;
import irvine.math.polynomial.HermitePolynomials;
import irvine.oeis.cons.PolynomialRootExpansionSequence;

/**
 * A393362 allocated for A.H.M. Smeets.
 * @author Sean A. Irvine
 */
public class A393362 extends PolynomialRootExpansionSequence {

  /** Construct the sequence. */
  public A393362() {
    super(0, new HermitePolynomials().getValue(6), CR.ZERO, CR.ONE);
  }
}

