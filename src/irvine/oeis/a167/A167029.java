package irvine.oeis.a167;
// manually 2025-06-10/polyx

import irvine.oeis.PolynomialFieldSequence;

/**
 * A167029 Difference between the number of positive and negative terms in the expansion of a skew symmetric matrix of order n.
 * @author Georg Fischer
 */
public class A167029 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A167029() {
    super(0, "[1]", "x,cosh,sqrt,x,^2,4,/,exp,*", 0, 1);
    setOffset(1);
    next();
    next();
  }
}
