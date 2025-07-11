package irvine.oeis.a352;
// Generated by gen_seq4.pl 2025-06-09.ack/polyex

import irvine.oeis.PolynomialFieldSequence;

/**
 * A352638 Expansion of e.g.f. 1/(1 - 3*sin(x)).
 * E.g.f.: <code>1/(1-3*sin(x))</code>.
 * @author Georg Fischer
 */
public class A352638 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A352638() {
    super(0, "[1]", "1,1,3,x,sin,*,-,/", 0, 1);
  }
}
