package irvine.oeis.a062;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A062544 a(n) = n plus sum of previous three terms.
 * @author Sean A. Irvine
 */
public class A062544 extends LinearRecurrence {

  /** Construct the sequence. */
  public A062544() {
    super(new long[] {1, -1, 0, -2, 3}, new long[] {0, 1, 3, 7, 15});
  }
}
