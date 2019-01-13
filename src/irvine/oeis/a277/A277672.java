package irvine.oeis.a277;

import irvine.oeis.LinearRecurrence;

/**
 * A277672.
 * @author Sean A. Irvine
 */
public class A277672 extends LinearRecurrence {

  /** Construct the sequence. */
  public A277672() {
    super(new long[] {1, -2, 3, -4, 5, -6, 7, -8, 9}, new long[] {1, 9, 73, 592, 4801, 38935, 315754, 2560693, 20766637});
  }
}
