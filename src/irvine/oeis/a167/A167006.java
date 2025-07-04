package irvine.oeis.a167;
// Generated by gen_seq4.pl 2025-06-15.ack/polya at 2025-06-15 21:33

import irvine.oeis.PolynomialFieldSequence;

/**
 * A167006 G.f.: exp( Sum_{n&gt;=1} x^n/n * Sum_{k=0..n} binomial(n^2, n*k) ).
 * new A167009()
 * @author Georg Fischer
 */
public class A167006 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A167006() {
    super(0, "[1]", "x,B,x,/,int,exp", 0, 0, 1, 1, new A167009());
  }
}
