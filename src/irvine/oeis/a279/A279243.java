package irvine.oeis.a279;
// Generated by gen_seq4.pl 2025-02-18.ack/polyz at 2025-02-18 23:09

import irvine.oeis.PolynomialFieldSequence;

/**
 * A279243 Denominators of coefficients in expansion of (sin x)/(1 + cos(sqrt(x))).
 * (sin(x))/(1+cos(sqrt(x)))
 * @author Georg Fischer
 */
public class A279243 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A279243() {
    super(0, "[[0, 1]]", ";x;<1;sin;1;x;cos;+;/", 1, 4, 0, 2);
  }
}
