package irvine.oeis.a393;

import irvine.math.cr.CR;
import irvine.math.polynomial.HermitePolynomials;
import irvine.oeis.cons.PolynomialRootExpansionSequence;

/**
 * A393354 allocated for A.H.M. Smeets.
 * @author Sean A. Irvine
 */
public class A393354 extends PolynomialRootExpansionSequence {

  /** Construct the sequence. */
  public A393354() {
    super(1, new HermitePolynomials().getValue(4), CR.ONE, CR.TWO);
  }
}

