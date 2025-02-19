package irvine.oeis.a307;
// Generated by gen_seq4.pl 2025-02-12.ack/polyx at 2025-02-12 23:23

import irvine.oeis.PolynomialFieldSequence;

/**
 * A307490 G.f. A(x) satisfies: A(x) = 1/(1 - x*A(x) - x^2*A(x)^2/(1 - x^2*A(x)^2/(1 - x^2*A(x)^2/(1 - ...)))), a continued fraction.
 * 2/(1-2*x*A(x)+sqrt(1-4*x^2*A(x)^2))
 * @author Georg Fischer
 */
public class A307490 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A307490() {
    super(0, "[[1]]", ";2;1;2;x;*;A;*;-;1;4;x;^2;*;A;^2;*;-;sqrt;+;/", 0, 0);
  }
}
