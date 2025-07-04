package irvine.oeis.a352;
// Generated by gen_seq4.pl 2025-06-09.ack/polyex

import irvine.oeis.PolynomialFieldSequence;

/**
 * A352647 Expansion of e.g.f. 1/(1 - 3 * x * cos(x)).
 * E.g.f.: <code>1/(1-3*x*cos(x))</code>.
 * @author Georg Fischer
 */
public class A352647 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A352647() {
    super(0, "[1]", "1,1,3,x,*,x,cos,*,-,/", 0, 1);
  }
}
