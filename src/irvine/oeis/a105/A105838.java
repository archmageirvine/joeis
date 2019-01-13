package irvine.oeis.a105;

import irvine.oeis.LinearRecurrence;

/**
 * A105838.
 * @author Sean A. Irvine
 */
public class A105838 extends LinearRecurrence {

  /** Construct the sequence. */
  public A105838() {
    super(new long[] {1, -1, -398, 398, 1}, new long[] {0, 39, 159, 15720, 63480});
  }
}
