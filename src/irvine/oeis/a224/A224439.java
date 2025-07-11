package irvine.oeis.a224;
// Generated by gen_seq4.pl 2025-06-15.ack/polya at 2025-06-15 21:33

import irvine.oeis.PolynomialFieldSequence;

/**
 * A224439 G.f.: A(x) = exp( Sum_{n&gt;=1} sigma(n)^(n-1) * x^n/n ).
 * new A224440()
 * @author Georg Fischer
 */
public class A224439 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A224439() {
    super(0, "[1]", "x,B,x,/,int,exp", 0, 0, 1, 1, new A224440());
  }
}
