package irvine.oeis.a189;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A189834 a(n) = n^2 + 9.
 * @author Sean A. Irvine
 */
public class A189834 extends LinearRecurrence {

  /** Construct the sequence. */
  public A189834() {
    super(new long[] {1, -3, 3}, new long[] {9, 10, 13});
  }
}
