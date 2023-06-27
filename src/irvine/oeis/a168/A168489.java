package irvine.oeis.a168;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A168489 Numbers that are congruent to {7,11} mod 12.
 * @author Sean A. Irvine
 */
public class A168489 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168489() {
    super(1, new long[] {-1, 1, 1}, new long[] {7, 11, 19});
  }
}
