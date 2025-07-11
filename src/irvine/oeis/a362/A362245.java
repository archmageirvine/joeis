package irvine.oeis.a362;
// Generated by gen_seq4.pl 2025-06-09.ack/polyex

import irvine.oeis.PolynomialFieldSequence;

/**
 * A362245 Expansion of e.g.f. 1/(1 - x * exp(x * (exp(x) - 1))).
 * E.g.f.: <code>1/(1-x*exp(x*(exp(x)-1)))</code>.
 * @author Georg Fischer
 */
public class A362245 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A362245() {
    super(0, "[1]", "1,1,x,x,x,exp,1,-,*,exp,*,-,/", 0, 1);
  }
}
