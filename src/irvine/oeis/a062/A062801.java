package irvine.oeis.a062;

import irvine.oeis.a210.A210286;

/**
 * A062801 Number of 2 X 2 non-singular integer matrices with entries from {0,...,n}.
 * @author Sean A. Irvine
 */
public class A062801 extends A210286 {

  /** Construct the sequence. */
  public A062801() {
    super(0, n -> new Long[] {0L, n}, (n, w, x, y, z) -> w * z - x * y != 0);
  }
}
