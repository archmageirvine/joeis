package irvine.oeis.a360;
// Generated by gen_seq4.pl 2025-06-09.ack/polyex

import irvine.oeis.PolynomialFieldSequence;

/**
 * A360586 Expansion of e.g.f.: exp(x)*(exp(x)-1)*(exp(x)-x).
 * E.g.f.: <code>exp(x)*(exp(x)-1)*(exp(x)-x)</code>.
 * @author Georg Fischer
 */
public class A360586 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A360586() {
    super(0, "[1]", "x,exp,x,exp,1,-,*,x,exp,x,-,*", 0, 1);
  }
}
