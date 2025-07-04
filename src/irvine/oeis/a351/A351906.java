package irvine.oeis.a351;
// Generated by gen_seq4.pl 2025-06-09.ack/polyex

import irvine.oeis.PolynomialFieldSequence;

/**
 * A351906 Expansion of e.g.f. exp(x * (1 - x^4)).
 * E.g.f.: <code>exp(x*(1-x^4))</code>.
 * @author Georg Fischer
 */
public class A351906 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A351906() {
    super(0, "[1]", "x,1,x,^4,-,*,exp", 0, 1);
  }
}
