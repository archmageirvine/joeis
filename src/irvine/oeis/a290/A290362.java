package irvine.oeis.a290;

import irvine.oeis.LinearRecurrence;

/**
 * A290362 Number of 8-leaf rooted trees with n levels.
 * @author Sean A. Irvine
 */
public class A290362 extends LinearRecurrence {

  /** Construct the sequence. */
  public A290362() {
    super(new long[] {-1, 8, -28, 56, -70, 56, -28, 8}, new long[] {0, 1, 22, 223, 1344, 5727, 19193, 54046});
  }
}
