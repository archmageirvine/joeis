package irvine.oeis.a304;
// manually 2025-08-13/polya at 2025-08-13 11:25

import irvine.oeis.PolynomialFieldSequence;

/**
 * A304313 Logarithmic derivative of F(x) that satisfies: [x^n] exp( n^3 * x ) / F(x) = 0 for n&gt;0.
 * new A304323()
 * @author Georg Fischer
 */
public class A304313 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A304313() {
    super(0, "[1]", "x,B,log,*n,>1", 1, 0, 1, 1, new A304323());
  }
}
