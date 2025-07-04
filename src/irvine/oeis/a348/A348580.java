package irvine.oeis.a348;
// Generated by gen_seq4.pl 2025-06-09.ack/polyex

import irvine.oeis.PolynomialFieldSequence;

/**
 * A348580 Expansion of e.g.f. exp(x) / (1 - sin(x)).
 * E.g.f.: <code>exp(x)/(1-sin(x))</code>.
 * @author Georg Fischer
 */
public class A348580 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A348580() {
    super(0, "[1]", "x,exp,1,x,sin,-,/", 0, 1);
  }
}
