package irvine.oeis.a290;

import irvine.oeis.LinearRecurrence;

/**
 * A290363 Number of 9-leaf rooted trees with n levels.
 * @author Sean A. Irvine
 */
public class A290363 extends LinearRecurrence {

  /** Construct the sequence. */
  public A290363() {
    super(new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9}, new long[] {0, 1, 30, 424, 3357, 17836, 71769, 236093, 667335});
  }
}
