package irvine.oeis.a355;
// Generated by gen_seq4.pl 2025-06-09.ack/polyex

import irvine.oeis.PolynomialFieldSequence;

/**
 * A355501 Expansion of e.g.f. exp(3 * x * exp(x)).
 * E.g.f.: <code>exp(3*x*exp(x))</code>.
 * @author Georg Fischer
 */
public class A355501 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A355501() {
    super(0, "[1]", "3,x,*,x,exp,*,exp", 0, 1);
  }
}
