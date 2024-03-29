package irvine.oeis.a204;
// Generated by gen_seq4.pl parmof2 at 2021-10-25 20:25

import irvine.oeis.a203.A203991;

/**
 * A204184 Array:  row n shows the coefficients of the characteristic polynomial of the n-th principal submatrix of (f(i,j)), where f(i,1)=f(1,j)=1, f(i,i)=(-1)^(i-1); f(i,j)=0 otherwise; as in A204181.
 *
 * @author Georg Fischer
 */
public class A204184 extends A203991 {

  /** Construct the sequence. */
  public A204184() {
    super(1, new A204183());
  }
}
