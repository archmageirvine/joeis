package irvine.oeis.a110;

import irvine.oeis.LinearRecurrence;

/**
 * A110550.
 * @author Sean A. Irvine
 */
public class A110550 extends LinearRecurrence {

  /** Construct the sequence. */
  public A110550() {
    super(new long[] {1, -1, 0, 0, 1}, new long[] {1, 3, 2, 4, 4});
  }
}
