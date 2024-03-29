package irvine.oeis.a204;
// Generated by gen_seq4.pl parmof2 at 2021-10-25 20:25

import irvine.oeis.a203.A203991;

/**
 * A204019 Array:  row n shows the coefficients of the characteristic polynomial of the n-th principal submatrix of max{1+j mod i, 1+i mod j} (A204018).
 *
 * @author Georg Fischer
 */
public class A204019 extends A203991 {

  /** Construct the sequence. */
  public A204019() {
    super(1, new A204018());
  }
}
