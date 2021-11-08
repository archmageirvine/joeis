package irvine.oeis.a185;
// manually uvpolx 2021-10-25

import irvine.math.polynomial.Polynomial;
import irvine.oeis.a208.A208508;

/**
 * A185045 Triangle of coefficients of polynomials u(n,x) jointly generated with A208659; see the Formula section.
 * (a,b,c,d,e,f) = (1, 2x, 0, 1, 2x, 1)
 *
 * @author Georg Fischer
 */
public class A185045 extends A208508 {

  /** Construct the sequence. */
  public A185045() {
    super(1, Polynomial.create(1), Polynomial.create(0, 2), Polynomial.create(0), Polynomial.create(1), Polynomial.create(0, 2), Polynomial.create(1));
  }
}
