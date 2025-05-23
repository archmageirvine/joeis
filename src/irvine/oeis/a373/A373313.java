package irvine.oeis.a373;
// Generated by gen_seq4.pl 2025-05-11.ack/polya at 2025-05-11 22:56

import irvine.oeis.PolynomialFieldSequence;

/**
 * A373313 Expansion of g.f. A(x) satisfying A(x)^2 = A( x*A(x)/(1 - A(x))^3 ).
 * new A373308()
 * @author Georg Fischer
 */
public class A373313 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A373313() {
    super(1, "[1]", "x,S,<1,rev", 0, 0, 1, 1, new A373308());
  }
}
