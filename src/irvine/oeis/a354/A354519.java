package irvine.oeis.a354;
// Generated by gen_seq4.pl 2025-06-09.ack/polyex

import irvine.oeis.PolynomialFieldSequence;

/**
 * A354519 Expansion of e.g.f. exp(x) * log(sec(x)).
 * E.g.f.: <code>exp(x)*log(sec(x))</code>.
 * @author Georg Fischer
 */
public class A354519 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A354519() {
    super(1, "[1]", "x,exp,x,sec,log,*", 0, 1);
  }
}
