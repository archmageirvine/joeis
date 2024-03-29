package irvine.oeis.a208;
// Generated by gen_seq4.pl uvpolx at 2021-09-04 15:09

import irvine.math.polynomial.Polynomial;

/**
 * A208747 Triangle of coefficients of polynomials u(n,x) jointly generated with A208748; see the Formula section.
 * (a,b,c,d,e,f) = (1, 2x, 0, 2x, 2x, 0)
 * @author Georg Fischer
 */
public class A208747 extends A208508 {

  /** Construct the sequence. */
  public A208747() {
    super(1, Polynomial.create(1), Polynomial.create(0, 2), Polynomial.create(0), Polynomial.create(0, 2), Polynomial.create(0, 2), Polynomial.create(0));
  }
}
