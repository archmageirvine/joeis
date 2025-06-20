package irvine.oeis.a376;
// Generated by gen_seq4.pl 2025-02-13.ack/polyx at 2025-02-13 23:28

import irvine.oeis.PolynomialFieldSequence;

/**
 * A376176 G.f. A(x) satisfies x = A( x - A(x)^4/x^2 ).
 * x*A(x)^2+A(A(x))^4                        newpoly
 * @author Georg Fischer
 */
public class A376176 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A376176() {
    super(1, "[[0, 1, 1, 6]]", ",x,A,^4,x,^2,/,-,rev", 2, 0);
  }
}
