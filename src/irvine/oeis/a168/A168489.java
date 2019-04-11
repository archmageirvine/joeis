package irvine.oeis.a168;

import irvine.oeis.LinearRecurrence;

/**
 * A168489 Numbers that are congruent to <code>{7,11} mod 12</code>.
 * @author Sean A. Irvine
 */
public class A168489 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168489() {
    super(new long[] {-1, 1, 1}, new long[] {7, 11, 19});
  }
}
