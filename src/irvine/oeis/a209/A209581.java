package irvine.oeis.a209;
// Generated by gen_seq4.pl uvpolx at 2021-09-04 15:09

import irvine.math.polynomial.Polynomial;
import irvine.oeis.a208.A208508;

/**
 * A209581 Triangle of coefficients of polynomials u(n,x) jointly generated with A209582; see the Formula section.
 * (a,b,c,d,e,f) = (x, 1, 0,x+1, 2x, 1)
 * @author Georg Fischer
 */
public class A209581 extends A208508 {

  /** Construct the sequence. */
  public A209581() {
    super(1, Polynomial.create(0, 1), Polynomial.create(1), Polynomial.create(0), Polynomial.create(1, 1), Polynomial.create(0, 2), Polynomial.create(1));
  }
}
