package irvine.oeis.a191;

import irvine.oeis.LinearRecurrence;

/**
 * A191275 Numbers that are congruent to {0, 1, 3, 5, 7, 9, 11} mod 12.
 * @author Sean A. Irvine
 */
public class A191275 extends LinearRecurrence {

  /** Construct the sequence. */
  public A191275() {
    super(new long[] {-1, 1, 0, 0, 0, 0, 0, 1}, new long[] {0, 1, 3, 5, 7, 9, 11, 12});
  }
}
