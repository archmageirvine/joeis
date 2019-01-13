package irvine.oeis.a110;

import irvine.oeis.LinearRecurrence;

/**
 * A110935.
 * @author Sean A. Irvine
 */
public class A110935 extends LinearRecurrence {

  /** Construct the sequence. */
  public A110935() {
    super(new long[] {1, 1, -3, -2, 3, 1}, new long[] {0, 4, 6, 12, 20, 36});
  }
}
