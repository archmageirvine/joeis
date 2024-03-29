package irvine.oeis.a210;
// Generated by gen_seq4.pl A210000/parmof3 at 2022-02-02 22:52

/**
 * A210285 Number of 2 X 2 matrices with all elements in {0,1,...,n} and determinant floor(n/2).
 * @author Georg Fischer
 */
public class A210285 extends A210286 {

  /** Construct the sequence. */
  public A210285() {
    super(0, n -> new Long[] {0L, n}, (n, w, x, y, z) -> w * z - x * y == n / 2);
  }
}
