package irvine.oeis.a323;
// Generated by gen_seq4.pl 2025-02-12.ack/polyx at 2025-02-12 23:23

import irvine.oeis.PolynomialFieldSequence;

/**
 * A323692 G.f. satisfies: A(x) = x + A( A(x)^3 + A(x)^4 ).
 * x+A(A(x)^3+A(x)^4)
 * @author Georg Fischer
 */
public class A323692 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A323692() {
    super(1, "[[0, 1]]", ";x;A;^3;A;^4;+;sub;+", 0, 0);
  }
}
