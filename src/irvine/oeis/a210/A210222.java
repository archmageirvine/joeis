package irvine.oeis.a210;
// manually uvpolx at 2021-10-25

import irvine.math.polynomial.Polynomial;
import irvine.oeis.a208.A208509;

/**
 * A210222 Triangle of coefficients of polynomials v(n,x) jointly generated with A104698; see the Formula section.
 * (a,b,c,d,e,f) = (x, 1, 1, 2x, 1, 1)
 *
 * @author Georg Fischer
 */
public class A210222 extends A208509 {

  /**
   * Construct the sequence.
   */
  public A210222() {
    super(1, Polynomial.create(0, 1), Polynomial.create(1), Polynomial.create(1), Polynomial.create(0, 2), Polynomial.create(1), Polynomial.create(1));
  }
}
