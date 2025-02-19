package irvine.oeis.a276;
// Generated by gen_seq4.pl 2025-02-14.ack/polyx at 2025-02-14 22:55

import irvine.oeis.PolynomialFieldSequence;

/**
 * A276365 G.f. A(x) satisfies: A(x - 2*A(x)^2) = x - A(x)^2.
 * x+A(2*A(x)-x)^2
 * @author Georg Fischer
 */
public class A276365 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A276365() {
    super(1, "[[0,1]]", ";x;2;A;*;x;-;sub;^2;+", 0, 0);
  }
}
