package irvine.oeis.a239;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A239831 Floor(7n^2/2) + floor(5n/2) + floor(3n/7).
 * @author Sean A. Irvine
 */
public class A239831 extends LinearRecurrence {

  /** Construct the sequence. */
  public A239831() {
    super(1, new long[] {1, -1, -1, 1, 0, 0, 0, -1, 1, 1}, new long[] {5, 19, 39, 67, 101, 143, 191, 247, 308, 379});
  }
}
