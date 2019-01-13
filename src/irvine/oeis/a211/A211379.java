package irvine.oeis.a211;

import irvine.oeis.LinearRecurrence;

/**
 * A211379.
 * @author Sean A. Irvine
 */
public class A211379 extends LinearRecurrence {

  /** Construct the sequence. */
  public A211379() {
    super(new long[] {-1, 2, 1, -4, 1, 2}, new long[] {0, 0, 0, 3, 7, 16});
  }
}
