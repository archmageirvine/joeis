package irvine.oeis.a184;
// Generated by gen_seq4.pl 2025-06-15.ack/polya at 2025-06-15 21:33

import irvine.oeis.PolynomialFieldSequence;

/**
 * A184512 G.f.: exp( Sum_{n&gt;=1} (x^n/n)/sqrt(1 - 2*(2*x)^n) ).
 * new A184513()
 * @author Georg Fischer
 */
public class A184512 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A184512() {
    super(0, "[1]", "x,B,x,/,int,exp", 0, 0, 1, 1, new A184513());
  }
}
