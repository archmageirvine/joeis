package irvine.oeis.a393;

import irvine.math.cr.CR;
import irvine.math.polynomial.HermitePolynomials;
import irvine.oeis.cons.PolynomialRootExpansionSequence;

/**
 * A393364 allocated for A.H.M. Smeets.
 * @author Sean A. Irvine
 */
public class A393364 extends PolynomialRootExpansionSequence {

  /** Construct the sequence. */
  public A393364() {
    super(1, new HermitePolynomials().getValue(6), CR.TWO, CR.THREE);
  }
}

