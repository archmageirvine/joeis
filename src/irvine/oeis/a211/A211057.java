package irvine.oeis.a211;
// Generated by gen_seq4.pl A210000/parmof4 at 2022-02-02 22:52

import irvine.oeis.a210.A210000;

/**
 * A211057 Number of 2 X 2 matrices having all terms in {1,...,n} and determinant in the closed interval [0,n].
 * @author Georg Fischer
 */
public class A211057 extends A210000 {

  /** Construct the sequence. */
  public A211057() {
    super(1, n -> new Long[] {1L, n}, (w, x, y, z) -> w * z - x * y, (d, n) -> d >= 0 && d <= n);
  }
}
