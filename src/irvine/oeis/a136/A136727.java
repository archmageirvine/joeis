package irvine.oeis.a136;
// Generated by gen_seq4.pl 2025-06-09.ack/polyex

import irvine.oeis.PolynomialFieldSequence;

/**
 * A136727 E.g.f.: A(x) = (exp(x)/(3 - 2*exp(x)))^(1/3).
 * E.g.f.: <code>(exp(x)/(3-2*exp(x)))^(1/3)</code>.
 * @author Georg Fischer
 */
public class A136727 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A136727() {
    super(0, "[1]", "x,exp,3,2,x,exp,*,-,/,^1/3", 0, 1);
  }
}
