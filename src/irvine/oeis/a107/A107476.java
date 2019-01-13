package irvine.oeis.a107;

import irvine.oeis.LinearRecurrence;

/**
 * A107476.
 * @author Sean A. Irvine
 */
public class A107476 extends LinearRecurrence {

  /** Construct the sequence. */
  public A107476() {
    super(new long[] {-1, 4, 6, -24, 4, 6}, new long[] {0, 1, 1, 2, 3, 5});
  }
}
