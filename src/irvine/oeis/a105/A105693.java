package irvine.oeis.a105;

import irvine.oeis.LinearRecurrence;

/**
 * A105693.
 * @author Sean A. Irvine
 */
public class A105693 extends LinearRecurrence {

  /** Construct the sequence. */
  public A105693() {
    super(new long[] {2, -7, 5}, new long[] {0, 1, 4});
  }
}
