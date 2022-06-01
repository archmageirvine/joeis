package irvine.oeis.a174;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A174929 Partial sums of A174928.
 * @author Sean A. Irvine
 */
public class A174929 extends LinearRecurrence {

  /** Construct the sequence. */
  public A174929() {
    super(new long[] {1, -2, 0, 2}, new long[] {1, 66, 132, 262});
  }
}
