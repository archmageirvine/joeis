package irvine.oeis.a373;
// Generated by gen_seq4.pl 2025-02-12.ack/polyx at 2025-02-12 23:23

import irvine.oeis.PolynomialFieldSequence;

/**
 * A373185 G.f. A(x) satisfies A(x) = 1/(1 - x)^2 - 1 + A(x^4).
 * 1/(1-x)^2-1+A(x^4)
 * @author Georg Fischer
 */
public class A373185 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A373185() {
    super(1, "[[1]]", ";1;1;x;-;^2;/;1;-;x;^4;sub;+", 0, 0);
  }
}
