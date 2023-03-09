package irvine.oeis.a062;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A062123 a(n) = (9n^2 + 9n + 4)/2.
 * @author Sean A. Irvine
 */
public class A062123 extends LinearRecurrence {

  /** Construct the sequence. */
  public A062123() {
    super(new long[] {1, -3, 3}, new long[] {2, 11, 29});
  }
}
