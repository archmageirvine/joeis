package irvine.oeis.a374;
// Generated by gen_seq4.pl 2025-02-12.ack/polyx at 2025-02-12 23:23

import irvine.oeis.PolynomialFieldSequence;

/**
 * A374568 Expansion of g.f. A(x) satisfying x = A(x - x^2) - A(x + x^2)^2.
 * A(1-x-sqrt(1-4*x))^2+(1-sqrt(1-4*x))/2
 * @author Georg Fischer
 */
public class A374568 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A374568() {
    super(1, "[[0, 1]]", ";1;x;-;1;4;x;*;-;sqrt;-;sub;^2;1;1;4;x;*;-;sqrt;-;2;/;+", 0, 0);
  }
}
