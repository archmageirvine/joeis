package irvine.oeis.a369;
// Generated by gen_seq4.pl 2025-02-16.ack/polyx at 2025-02-16 22:50

import irvine.oeis.PolynomialFieldSequence;

/**
 * A369091 Expansion of e.g.f. A(x) satisfying A(x) = x + A( x^2*exp(x) ), with A(0) = 0.
 * x+A(x^2*exp(x))
 * @author Georg Fischer
 */
public class A369091 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A369091() {
    super(1, "[[0,1]]", ";x;x;^2;x;exp;*;sub;+", 0, 1);
  }
}
