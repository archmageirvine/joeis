package irvine.oeis.a028;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A028560 a(n) = n*(n + 6).
 * @author Sean A. Irvine
 */
public class A028560 extends LinearRecurrence {

  /** Construct the sequence. */
  public A028560() {
    super(new long[] {1, -3, 3}, new long[] {0, 7, 16});
  }
}
