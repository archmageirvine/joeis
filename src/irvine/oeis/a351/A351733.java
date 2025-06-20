package irvine.oeis.a351;
// Generated by gen_seq4.pl 2025-06-09.ack/polyex

import irvine.oeis.PolynomialFieldSequence;

/**
 * A351733 Expansion of e.g.f. exp( 2 * x * (exp(x) - 1) ).
 * E.g.f.: <code>exp(2*x*(exp(x)-1))</code>.
 * @author Georg Fischer
 */
public class A351733 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A351733() {
    super(0, "[1]", "2,x,*,x,exp,1,-,*,exp", 0, 1);
  }
}
