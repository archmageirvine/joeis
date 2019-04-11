package irvine.oeis.a031;

import irvine.oeis.LinearRecurrence;

/**
 * A031150 Appending a digit to <code>n^2</code> gives another perfect square.
 * @author Sean A. Irvine
 */
public class A031150 extends LinearRecurrence {

  /** Construct the sequence. */
  public A031150() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 38, 0, 0, 0, 0, 0, 0}, new long[] {1, 2, 4, 5, 6, 12, 18, 43, 80, 154, 191, 228, 456, 684});
  }
}
