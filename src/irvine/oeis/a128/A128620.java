package irvine.oeis.a128;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A128620 Row sums of A128619.
 * @author Sean A. Irvine
 */
public class A128620 extends LinearRecurrence {

  /** Construct the sequence. */
  public A128620() {
    super(new long[] {1, 1, -4, -3, 4, 1}, new long[] {1, 1, 4, 6, 15, 24});
  }
}
