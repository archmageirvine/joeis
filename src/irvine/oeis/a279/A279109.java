package irvine.oeis.a279;

import irvine.oeis.PolynomialFieldSequence;

/**
 * A279109 Denominators of coefficients in expansion of 1/(1 + cos(sqrt(x))).
 * 1/(1+cos(sqrt(x)))
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A279109 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A279109() {
    super(0, "[[1]]", ";1;1;x;cos;+;/", 2, 4, 0, 2);
  }
}
