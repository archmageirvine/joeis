package irvine.oeis.a347;
// Generated by gen_seq4.pl 2025-06-09.ack/polyex

import irvine.oeis.PolynomialFieldSequence;

/**
 * A347004 Expansion of e.g.f. exp( -log(1 - x)^5 / 5! ).
 * E.g.f.: <code>exp(-log(1-x)^5/120)</code>.
 * @author Georg Fischer
 */
public class A347004 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A347004() {
    super(0, "[1],[1,-1]", "0,p1,log,^5,120,/,-,exp", 0, 1);
  }
}
