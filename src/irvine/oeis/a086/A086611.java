package irvine.oeis.a086;
// Generated by gen_seq4.pl 2025-02-12.ack/polyx at 2025-02-12 23:23

import irvine.oeis.PolynomialFieldSequence;

/**
 * A086611 Row sums of triangle of coefficients (A086610) where T(n,k) is the coefficient of x^n*y^k in f(x,y) that satisfies f(x,y) = (1-x-x^2)/(1-x)^2 + xy*f(x,y)^2.
 * (1-x-x^2)/(1-x)^2+x*A(x)^2
 * @author Georg Fischer
 */
public class A086611 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A086611() {
    super(0, "[[1]]", ";1;x;-;x;^2;-;1;x;-;^2;/;x;A;^2;*;+", 0, 0);
  }
}
