package irvine.oeis.a136;
// Generated by gen_seq4.pl 2025-06-09.ack/polyex

import irvine.oeis.PolynomialFieldSequence;

/**
 * A136728 E.g.f.: A(x) = (exp(x)/(4 - 3*exp(x)))^(1/4).
 * E.g.f.: <code>(exp(x)/(4-3*exp(x)))^(1/4)</code>.
 * @author Georg Fischer
 */
public class A136728 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A136728() {
    super(0, "[1]", "x,exp,4,3,x,exp,*,-,/,^1/4", 0, 1);
  }
}
