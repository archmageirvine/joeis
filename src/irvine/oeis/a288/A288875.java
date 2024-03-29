package irvine.oeis.a288;
// Generated by gen_seq4.pl transpose at 2022-05-29 21:43

import irvine.oeis.a214.A214406;
import irvine.oeis.triangle.Transpose;

/**
 * A288875 Triangle read by rows. The rows give the coefficients of the  numerator polynomials for the o.g.f.s of the diagonal sequences of triangle A028338.
 * @author Georg Fischer
 */
public class A288875 extends Transpose {

  /** Construct the sequence. */
  public A288875() {
    super(new A214406());
  }
}
