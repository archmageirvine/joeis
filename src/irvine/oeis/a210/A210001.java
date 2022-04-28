package irvine.oeis.a210;
// manually

/**
 * A210001 Number of 2 X 2 matrices having all elements in {1, 2,...,n} and determinant 3.
 * @author Georg Fischer
 */
public class A210001 extends A210286 {

  /** Construct the sequence. */
  public A210001() {
    super(0, n -> new Long[] {1L, n}, (n, w, x, y, z) -> w * z - x * y == 3);
  }
}
