package irvine.oeis.a213;
// Generated by gen_seq4.pl 2025-01-31.ack/polyx at 2025-01-31 23:19

import irvine.oeis.PolynomialFieldSequence;

/**
 * A213113 E.g.f.: A(x) = exp( x/A(-x*A(x)^9)^3 ).
 * exp(x/A(-x*A(x)^9)^3)
 * @author Georg Fischer
 */
public class A213113 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A213113() {
    super(0, "[[1]", ",x,A,^9,<1,neg,sub,^3,/,exp", 1, 1);
  }
}
