package irvine.oeis.a200;

import irvine.oeis.LinearRecurrence;

/**
 * A200672 Partial sums of <code>A173862</code>.
 * @author Sean A. Irvine
 */
public class A200672 extends LinearRecurrence {

  /** Construct the sequence. */
  public A200672() {
    super(new long[] {-2, 2, 0, 1}, new long[] {1, 2, 3, 5});
  }
}
