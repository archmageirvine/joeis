package irvine.oeis.a048;

import irvine.oeis.LinearRecurrence;

/**
 * A048772 Partial sums of <code>A048696</code>.
 * @author Sean A. Irvine
 */
public class A048772 extends LinearRecurrence {

  /** Construct the sequence. */
  public A048772() {
    super(new long[] {-1, -1, 3}, new long[] {1, 10, 29});
  }
}
