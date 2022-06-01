package irvine.oeis.a174;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A174121 Partial sums of A001580.
 * @author Sean A. Irvine
 */
public class A174121 extends LinearRecurrence {

  /** Construct the sequence. */
  public A174121() {
    super(new long[] {2, -9, 16, -14, 6}, new long[] {1, 4, 12, 29, 61});
  }
}
