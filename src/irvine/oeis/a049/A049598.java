package irvine.oeis.a049;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A049598 12 times triangular numbers.
 * @author Sean A. Irvine
 */
public class A049598 extends LinearRecurrence {

  /** Construct the sequence. */
  public A049598() {
    super(new long[] {1, -3, 3}, new long[] {0, 12, 36});
  }
}
