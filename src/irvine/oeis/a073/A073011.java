package irvine.oeis.a073;

import irvine.math.cr.CR;
import irvine.math.polynomial.Polynomial;
import irvine.oeis.cons.PolynomialRootExpansionSequence;

/**
 * A072223.
 * @author Sean A. Irvine
 */
public class A073011 extends PolynomialRootExpansionSequence {

  /** Construct the sequence. */
  public A073011() {
    super(1, Polynomial.create(1, 1, 0, -1, -1, -1, -1, -1, 0, 1, 1), CR.ONE, CR.TWO);
  }
}
