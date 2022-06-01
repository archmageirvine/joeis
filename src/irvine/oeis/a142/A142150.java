package irvine.oeis.a142;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A142150 The nonnegative integers interleaved with 0's.
 * @author Sean A. Irvine
 */
public class A142150 extends LinearRecurrence {

  /** Construct the sequence. */
  public A142150() {
    super(new long[] {-1, 0, 2, 0}, new long[] {0, 0, 1, 0});
  }
}
