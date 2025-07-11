package irvine.oeis.a351;
// Generated by gen_seq4.pl 2025-06-09.ack/polyex

import irvine.oeis.PolynomialFieldSequence;

/**
 * A351792 Expansion of e.g.f. 1/(1 - x*exp(-3*x)).
 * E.g.f.: <code>1/(1-x*exp(-3*x))</code>.
 * @author Georg Fischer
 */
public class A351792 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A351792() {
    super(0, "[1],[0,-3]", "1,1,x,p1,exp,*,-,/", 0, 1);
  }
}
