package irvine.oeis.a212;

import irvine.oeis.LinearRecurrence;

/**
 * A212752.
 * @author Sean A. Irvine
 */
public class A212752 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212752() {
    super(new long[] {1, -2, -2, 6, 0, -6, 2, 2}, new long[] {0, 14, 71, 238, 580, 1224, 2265, 3896});
  }
}
