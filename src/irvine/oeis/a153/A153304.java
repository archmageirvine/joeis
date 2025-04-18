package irvine.oeis.a153;
// Generated by gen_seq4.pl 2025-02-12.ack/polyx at 2025-02-12 23:23

import irvine.oeis.PolynomialFieldSequence;

/**
 * A153304 G.f. satisfies: A(x) = x + 2*A(x)^2 + 3*A(x)*A(A(x))^2 + 4*A(x)*A(A(x))*A(A(A(x)))^2 +...
 * rev(x*(1-2*A(x)+A(x)*A(A(x))))
 * @author Georg Fischer
 */
public class A153304 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A153304() {
    super(1, "[[1]]", ";x;1;2;A;*;-;A;A;sub;*;+;*;rev", 1, 0);
  }
}
