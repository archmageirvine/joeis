package irvine.oeis.a267;

import irvine.oeis.LinearRecurrence;

/**
 * A267452.
 * @author Sean A. Irvine
 */
public class A267452 extends LinearRecurrence {

  /** Construct the sequence. */
  public A267452() {
    super(new long[] {1, -1, 0, -1, 0, 1, 0, 1}, new long[] {1, 2, 4, 6, 10, 13, 19, 24});
  }
}
