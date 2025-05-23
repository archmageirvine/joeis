package irvine.oeis.a179;
// Generated by gen_seq4.pl 2025-02-12.ack/polyx at 2025-02-12 23:23

import irvine.oeis.PolynomialFieldSequence;

/**
 * A179488 G.f.: A(x) satisfies A(x) = x/(1 - (1-2x)*A( x/(1-2x) )).
 * x/(1-(1-2x)*A(x/(1-2x)))
 * @author Georg Fischer
 */
public class A179488 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A179488() {
    super(1, "[[0, 1]]", ";x;1;1;2;x;*;-;x;1;2;x;*;-;/;sub;*;-;/", 0, 0);
  }
}
