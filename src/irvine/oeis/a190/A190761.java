package irvine.oeis.a190;
// Generated by gen_seq4.pl 2025-02-12.ack/polyx at 2025-02-12 23:23

import irvine.oeis.PolynomialFieldSequence;

/**
 * A190761 Expansion of g.f. A(x) satisfying A(x) = x + A(A(x))^2 - A(A(x))^3.
 * x+A(A(x))^2-A(A(x))^3
 * @author Georg Fischer
 */
public class A190761 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A190761() {
    super(1, "[[1]]", ";x;A;sub;^2;+;A;sub;^3;-", 0, 0);
  }
}
