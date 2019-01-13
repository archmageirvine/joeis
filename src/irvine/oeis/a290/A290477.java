package irvine.oeis.a290;

import irvine.oeis.LinearRecurrence;

/**
 * A290477.
 * @author Sean A. Irvine
 */
public class A290477 extends LinearRecurrence {

  /** Construct the sequence. */
  public A290477() {
    super(new long[] {-6, 1, 0, 0, 0, 6}, new long[] {3, 19, 118, 709, 4259, 25557});
  }
}
