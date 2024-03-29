package irvine.oeis.a204;
// Generated by gen_seq4.pl parmof2 at 2021-10-25 20:25

import irvine.oeis.a203.A203991;

/**
 * A204172 Array:  row n shows the coefficients of the characteristic polynomial of the n-th principal submatrix of (f(i,j)), where f(i,j)=(1 if max(i,j) is odd, and 0 otherwise) as in A204171.
 *
 * @author Georg Fischer
 */
public class A204172 extends A203991 {

  /** Construct the sequence. */
  public A204172() {
    super(1, new A204171());
  }
}
