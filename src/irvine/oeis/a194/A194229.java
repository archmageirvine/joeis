package irvine.oeis.a194;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A194229 Partial sums of A057357.
 * @author Sean A. Irvine
 */
public class A194229 extends LinearRecurrence {

  /** Construct the sequence. */
  public A194229() {
    super(1, new long[] {1, -2, 1, 0, 0, 0, 0, -1, 2}, new long[] {0, 1, 2, 4, 6, 9, 12, 15, 19});
  }
}
