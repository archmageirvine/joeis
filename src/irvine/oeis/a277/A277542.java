package irvine.oeis.a277;

import irvine.oeis.LinearRecurrence;

/**
 * A277542 <code>a(n) =</code> denominator((n^2 <code>+ 3*n + 2)/n^3)</code>.
 * @author Sean A. Irvine
 */
public class A277542 extends LinearRecurrence {

  /** Construct the sequence. */
  public A277542() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 4, 0, 0, 0, 0, 0, 0, 0, -6, 0, 0, 0, 0, 0, 0, 0, 4, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 2, 27, 32, 125, 27, 343, 256, 729, 250, 1331, 864, 2197, 343, 3375, 2048, 4913, 1458, 6859, 4000, 9261, 1331, 12167, 6912, 15625, 4394, 19683, 10976, 24389, 3375, 29791, 16384});
  }
}
