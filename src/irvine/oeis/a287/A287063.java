package irvine.oeis.a287;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A287063 Number of dominating sets in the n-crown graph (for n &gt; 1).
 * @author Sean A. Irvine
 */
public class A287063 extends LinearRecurrence {

  /** Construct the sequence. */
  public A287063() {
    super(1, new long[] {-16, 68, -116, 101, -47, 11}, new long[] {3, 9, 39, 183, 833, 3629});
  }
}
