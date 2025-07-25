package irvine.oeis.a162;
// Generated by gen_seq4.pl 2025-07-26.ack/polya at 2025-07-26 21:09

import irvine.oeis.PolynomialFieldSequence;

/**
 * A162553 G.f.: A(x) = exp( Sum_{n&gt;=1} A162552(n)^2*x^n/n ) where the l.g.f. of A162552 is the log of the characteristic function of the squares.
 * new A162552()
 * @author Georg Fischer
 */
public class A162553 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A162553() {
    super(0, "[1]", "x,B,x,B,.*,/n,exp", 0, 0, 1, 1, new A162552());
  }
}
