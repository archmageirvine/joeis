package irvine.oeis.a114;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A114215 Number of derangements of [n] avoiding the patterns 123, 132 and 213.
 * @author Sean A. Irvine
 */
public class A114215 extends LinearRecurrence {

  /** Construct the sequence. */
  public A114215() {
    super(1, new long[] {-1, 0, 2, 0, 2, 0}, new long[] {0, 1, 2, 4, 4, 9});
  }
}
