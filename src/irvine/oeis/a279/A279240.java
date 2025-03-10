package irvine.oeis.a279;
// Generated by gen_seq4.pl 2025-02-18.ack/polyz at 2025-02-18 23:09

import irvine.oeis.PolynomialFieldSequence;

/**
 * A279240 Denominators of coefficients in expansion of (2 cos x)/(1 + cos(sqrt(x))).
 * (2*cos(x))/(1+cos(sqrt(x)))
 * @author Georg Fischer
 */
public class A279240 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A279240() {
    super(0, "[[1],[0, 0, 1]]", ",p1,cos, 2,*, 1,x,cos,+,/", 1, 4, 0, 2);
  }
}
