package irvine.oeis.a048;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A048772 Partial sums of A048696.
 * @author Sean A. Irvine
 */
public class A048772 extends LinearRecurrence {

  /** Construct the sequence. */
  public A048772() {
    super(new long[] {-1, -1, 3}, new long[] {1, 10, 29});
  }
}
