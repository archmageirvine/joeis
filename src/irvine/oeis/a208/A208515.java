package irvine.oeis.a208;
// Generated by gen_seq4.pl uvpolx at 2021-09-04 15:09

import irvine.math.polynomial.Polynomial;

/**
 * A208515 Triangle of coefficients of polynomials v(n,x) jointly generated with A208514; see the Formula section.
 * (a,b,c,d,e,f) = (1,x, 0,x,x, 1)
 * @author Georg Fischer
 */
public class A208515 extends A208509 {

  /** Construct the sequence. */
  public A208515() {
    super(1, Polynomial.create(1), Polynomial.create(0, 1), Polynomial.create(0), Polynomial.create(0, 1), Polynomial.create(0, 1), Polynomial.create(1));
  }
}
