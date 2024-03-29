package irvine.oeis.a280;
// Generated by gen_seq4.pl A210000/parmof3 at 2022-02-02 22:52

import irvine.oeis.a210.A210286;

/**
 * A280588 Number of 2 X 2 matrices with all terms in {0,1,...,n} and (sum of terms) = determinant.
 * @author Georg Fischer
 */
public class A280588 extends A210286 {

  /** Construct the sequence. */
  public A280588() {
    super(0, n -> new Long[] {0L, n}, (n, w, x, y, z) -> w * z - x * y == w + x + y + z);
  }
}
