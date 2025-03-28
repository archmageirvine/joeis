package irvine.oeis.a369;
// Generated by gen_seq4.pl 2025-02-12.ack/polyx at 2025-02-12 23:23

import irvine.oeis.PolynomialFieldSequence;

/**
 * A369554 Expansion of g.f. A(x) satisfying A(x) = A( x^2*(1+x)^4 ) / x.
 * A(x^2*(1+x)^4)/x
 * @author Georg Fischer
 */
public class A369554 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A369554() {
    super(1, "[[0, 1]]", ";x;^2;1;x;+;^4;*;sub;x;/", 1, 0);
  }
}
