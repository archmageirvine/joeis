package irvine.oeis.a211;

import irvine.oeis.LinearRecurrence;

/**
 * A211034 Number of <code>2 X 2</code> matrices having all elements in <code>{0,1,...,n}</code> and determinant <code>= 1 (mod 3)</code>.
 * @author Sean A. Irvine
 */
public class A211034 extends LinearRecurrence {

  /** Construct the sequence. */
  public A211034() {
    super(new long[] {1, -1, 0, -4, 4, 0, 6, -6, 0, -4, 4, 0, 1}, new long[] {0, 3, 24, 52, 164, 384, 592, 1131, 1944, 2628, 4128, 6144, 7744});
  }
}
