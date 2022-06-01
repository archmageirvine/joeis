package irvine.oeis.a121;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A121887 a(n) = (n^5 - 133*n^4 + 6729*n^3 - 158379*n^2 + 1720294*n - 6823316)/4.
 * @author Sean A. Irvine
 */
public class A121887 extends LinearRecurrence {

  /** Construct the sequence. */
  public A121887() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {-1705829, -1313701, -991127, -729173, -519643, -355049});
  }
}
