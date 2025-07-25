package irvine.oeis.a380;
// Generated by gen_seq4.pl 2025-06-09.ack/polyex

import irvine.oeis.PolynomialFieldSequence;

/**
 * A380261 Expansion of e.g.f. exp( ((1+3*x)^(2/3) - 1)/2 ).
 * E.g.f.: <code>exp(((1+3*x)^(2/3)-1)/2)</code>.
 * @author Georg Fischer
 */
public class A380261 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A380261() {
    super(0, "[1],[1,3]", "p1,^2/3,1,-,2,/,exp", 0, 1);
  }
}
