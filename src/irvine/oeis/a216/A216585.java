package irvine.oeis.a216;
// Generated by gen_seq4.pl 2025-06-15.ack/polya at 2025-06-15 21:33

import irvine.oeis.PolynomialFieldSequence;

/**
 * A216585 G.f.: exp( Sum_{n&gt;=1} A000984(n)*A002426(n)*x^n/n ), where A000984 is the central binomial coefficients and A002426 is the central trinomial coefficients.
 * new A216584()
 * @author Georg Fischer
 */
public class A216585 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A216585() {
    super(0, "[1]", "x,B,x,/,int,exp", 0, 0, 1, 1, new A216584());
  }
}
