package irvine.oeis.a362;
// Generated by gen_seq4.pl 2025-06-09.ack/polyex

import irvine.oeis.PolynomialFieldSequence;

/**
 * A362275 Expansion of e.g.f. exp(x*exp(-x*exp(-x))).
 * E.g.f.: <code>exp(x*exp(-x*exp(-x)))</code>.
 * @author Georg Fischer
 */
public class A362275 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A362275() {
    super(0, "[1],[0,-1]", "x,0,x,p1,exp,*,-,exp,*,exp", 0, 1);
  }
}
