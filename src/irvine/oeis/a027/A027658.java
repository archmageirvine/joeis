package irvine.oeis.a027;

import irvine.oeis.LinearRecurrence;

/**
 * A027658.
 * @author Sean A. Irvine
 */
public class A027658 extends LinearRecurrence {

  /** Construct the sequence. */
  public A027658() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {1, 4, 12, 31, 71, 147});
  }
}
