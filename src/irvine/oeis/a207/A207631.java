package irvine.oeis.a207;
// Generated by gen_seq4.pl uvpolx at 2021-09-04 15:09

import irvine.math.polynomial.Polynomial;
import irvine.oeis.a208.A208508;

/**
 * A207631 Triangle of coefficients of polynomials u(n,x) jointly generated with A207632; see the Formula section.
 * (a,b,c,d,e,f) = (1, 1, 0,x+1,x, 1)
 * @author Georg Fischer
 */
public class A207631 extends A208508 {

  /** Construct the sequence. */
  public A207631() {
    super(1, Polynomial.create(1), Polynomial.create(1), Polynomial.create(0), Polynomial.create(1, 1), Polynomial.create(0, 1), Polynomial.create(1));
  }
}
