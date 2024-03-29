package irvine.oeis.a188;
// Generated by gen_seq4.pl transpose at 2021-11-10 23:22

import irvine.oeis.a208.A208153;
import irvine.oeis.triangle.Transpose;

/**
 * A188107 Triangle T(n,k) with the coefficient [x^k] of 1/(1 - x - 2*x^2 + x^3)^(n-k+1) in row n, column k.
 * @author Georg Fischer
 */
public class A188107 extends Transpose {

  /** Construct the sequence. */
  public A188107() {
    super(new A208153());
  }
}
