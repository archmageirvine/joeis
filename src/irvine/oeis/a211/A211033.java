package irvine.oeis.a211;

import irvine.oeis.LinearRecurrence;

/**
 * A211033 Number of 2 X 2 matrices having all elements in <code>{0,1,...,n}</code> and determinant <code>= 0 (mod 3)</code>.
 * @author Sean A. Irvine
 */
public class A211033 extends LinearRecurrence {

  /** Construct the sequence. */
  public A211033() {
    super(new long[] {1, -1, 0, -4, 4, 0, 6, -6, 0, -4, 4, 0, 1}, new long[] {1, 10, 33, 152, 297, 528, 1217, 1834, 2673, 4744, 6385, 8448, 13073});
  }
}
