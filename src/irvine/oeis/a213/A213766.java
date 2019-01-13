package irvine.oeis.a213;

import irvine.oeis.LinearRecurrence;

/**
 * A213766.
 * @author Sean A. Irvine
 */
public class A213766 extends LinearRecurrence {

  /** Construct the sequence. */
  public A213766() {
    super(new long[] {-1, 1, 6, -3, -6, 5}, new long[] {1, 5, 24, 83, 263, 776});
  }
}
