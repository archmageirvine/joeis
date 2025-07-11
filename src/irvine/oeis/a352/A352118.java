package irvine.oeis.a352;
// Generated by gen_seq4.pl 2025-06-09.ack/polyex

import irvine.oeis.PolynomialFieldSequence;

/**
 * A352118 Expansion of e.g.f. 1/(2 - exp(3*x))^(1/3).
 * E.g.f.: <code>1/(2-exp(3*x))^(1/3)</code>.
 * @author Georg Fischer
 */
public class A352118 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A352118() {
    super(0, "[1],[0,3]", "1,2,p1,exp,-,^1/3,/", 0, 1);
  }
}
