package irvine.oeis.a343;
// Generated by gen_seq4.pl 2025-02-10.ack/poly at 2025-02-10 21:26

import irvine.oeis.PolynomialFieldSequence;

/**
 * A343439 G.f.: 1 + 2^0*x/(1 + 2^1*x/(1 + 2^2*x/(1 + 2^3*x/(1 + 2^4*x/(1 + ...))))).
 * G.f.: 1 + 2^0*x/(1 + 2^1*x/(1 + 2^2*x/(1 + 2^3*x/(1 + 2^4*x/(1 +...))))).
 * @author Georg Fischer
 */
public class A343439 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A343439() {
    super(0, "[[1],[0, 2]]", ", 1,x,p1,sub,/,+");
  }
}
