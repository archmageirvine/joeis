package irvine.oeis.a210;
// manually uvpolx at 2021-10-25

import irvine.math.polynomial.Polynomial;
import irvine.oeis.a208.A208509;

/**
 * A210602 Triangle of coefficients of polynomials v(n,x) jointly generated with A210597; see the Formula section.
 * (a,b,c,d,e,f) = (2x, 1, 1,x+1, 1, 1)
 *
 * @author Georg Fischer
 */
public class A210602 extends A208509 {

  /**
   * Construct the sequence.
   */
  public A210602() {
    super(1, Polynomial.create(0, 2), Polynomial.create(1), Polynomial.create(1), Polynomial.create(1, 1), Polynomial.create(1), Polynomial.create(1));
  }
}
