package irvine.oeis.a279;
// Generated by gen_seq4.pl 2025-02-18.ack/polyz at 2025-02-18 23:09

import irvine.oeis.PolynomialFieldSequence;

/**
 * A279121 Denominators of coefficients in expansion of 1/(1 + 2 cos(sqrt(x))).
 * 1/(1+2*cos(sqrt(x)))
 * @author Georg Fischer
 */
public class A279121 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A279121() {
    super(0, "[[1]]", ";1;1;2;x;cos;*;+;/", 1, 4, 0, 2);
  }
}
