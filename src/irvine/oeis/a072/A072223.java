package irvine.oeis.a072;

import irvine.math.cr.CR;
import irvine.math.polynomial.Polynomial;
import irvine.oeis.cons.PolynomialRootExpansionSequence;

/**
 * A072223 Decimal expansion of unimodal analog of golden section with respect to A072176: a=lim A072176(n)/A072176(n+1).
 * @author Sean A. Irvine
 */
public class A072223 extends PolynomialRootExpansionSequence {

  /** Construct the sequence. */
  public A072223() {
    super(0, Polynomial.create(1, -1, -2, 0, 1), CR.ZERO, CR.ONE);
  }
}
