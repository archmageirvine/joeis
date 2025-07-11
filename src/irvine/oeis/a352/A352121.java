package irvine.oeis.a352;
// Generated by gen_seq4.pl 2025-06-09.ack/polyex

import irvine.oeis.PolynomialFieldSequence;

/**
 * A352121 Expansion of e.g.f. sqrt(2 - exp(-2*x)).
 * E.g.f.: <code>sqrt(2-exp(-2*x))</code>.
 * @author Georg Fischer
 */
public class A352121 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A352121() {
    super(0, "[1],[0,-2]", "2,p1,exp,-,sqrt", 0, 1);
  }
}
