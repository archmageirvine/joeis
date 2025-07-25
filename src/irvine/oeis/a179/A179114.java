package irvine.oeis.a179;
// Generated by gen_seq4.pl 2025-07-26.ack/polya at 2025-07-26 21:09

import irvine.oeis.PolynomialFieldSequence;

/**
 * A179114 G.f.: A(x) = exp( Sum_{n&gt;=1} A179115(n)*x^n/n ), where A179115(n) = Sum_{d|n} phi(d^tau(d)).
 * new A179115()
 * @author Georg Fischer
 */
public class A179114 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A179114() {
    super(0, "[1]", "x,B,/n,exp", 0, 0, 1, 1, new A179115());
  }
}
