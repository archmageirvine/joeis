package irvine.oeis.a380;
// Generated by gen_seq4.pl 2025-06-09.ack/polyex

import irvine.oeis.PolynomialFieldSequence;

/**
 * A380210 Expansion of e.g.f. exp( (1+2*x)^(5/2) - 1 ).
 * E.g.f.: <code>exp((1+2*x)^(5/2)-1)</code>.
 * @author Georg Fischer
 */
public class A380210 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A380210() {
    super(0, "[1],[1,2]", "p1,^5/2,1,-,exp", 0, 1);
  }
}
