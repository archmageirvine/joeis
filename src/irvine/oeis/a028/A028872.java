package irvine.oeis.a028;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A028872 a(n) = n^2 - 3.
 * @author Sean A. Irvine
 */
public class A028872 extends LinearRecurrence {

  /** Construct the sequence. */
  public A028872() {
    super(2, new long[] {1, -3, 3}, new long[] {1, 6, 13});
  }
}
