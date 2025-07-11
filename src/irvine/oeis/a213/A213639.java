package irvine.oeis.a213;
// Generated by gen_seq4.pl 2025-02-12.ack/polyx at 2025-02-12 23:23

import irvine.oeis.PolynomialFieldSequence;

/**
 * A213639 G.f. A(x) satisfies x = A( x - A(x)^3/x ).
 * x+A(A(x))^3/A(x)
 * @author Georg Fischer
 */
public class A213639 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A213639() {
    super(1, "[[0, 1]]", ";x;A;sub;^3;A;/;+", 1, 0);
  }
}
