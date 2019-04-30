package irvine.oeis.a060;

import irvine.oeis.LinearRecurrence;

/**
 * A060453 Dot product of the squares and the quarter-squares: <code>a(n) = sum(i=1..n, i^2 * floor(i^2/4))</code>.
 * @author Sean A. Irvine
 */
public class A060453 extends LinearRecurrence {

  /** Construct the sequence. */
  public A060453() {
    super(new long[] {-1, 3, 0, -8, 6, 6, -8, 0, 3}, new long[] {0, 4, 22, 86, 236, 560, 1148, 2172, 3792});
  }
}
