package irvine.oeis.a266;

import irvine.oeis.LinearRecurrence;

/**
 * A266284.
 * @author Sean A. Irvine
 */
public class A266284 extends LinearRecurrence {

  /** Construct the sequence. */
  public A266284() {
    super(new long[] {64, 0, -84, 0, 21, 0}, new long[] {1, 2, 5, 106, 21, 1962});
  }
}
