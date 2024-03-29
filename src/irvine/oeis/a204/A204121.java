package irvine.oeis.a204;
// Generated by gen_seq4.pl parmof2 at 2021-10-25 20:25

import irvine.oeis.a203.A203991;

/**
 * A204121 Array:  row n shows the coefficients of the characteristic polynomial of the n-th principal submatrix of f(i,j) = gcd(prime(i+1), prime(j+1)) (A204120).
 *
 * @author Georg Fischer
 */
public class A204121 extends A203991 {

  /** Construct the sequence. */
  public A204121() {
    super(1, new A204120());
  }
}
