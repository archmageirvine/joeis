package irvine.oeis.a226;

import irvine.oeis.LinearRecurrence;

/**
 * A226023 A142705 (numerators of <code>1/4-1/(4n^2))</code> sorted to natural order.
 * @author Sean A. Irvine
 */
public class A226023 extends LinearRecurrence {

  /** Construct the sequence. */
  public A226023() {
    super(new long[] {1, -1, 0, -2, 2, 0, 1}, new long[] {0, 2, 3, 6, 12, 15, 20});
  }
}
