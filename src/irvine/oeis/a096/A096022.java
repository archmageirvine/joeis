package irvine.oeis.a096;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A096022 Numbers that are congruent to {15, 27, 39, 51} mod 60.
 * @author Sean A. Irvine
 */
public class A096022 extends LinearRecurrence {

  /** Construct the sequence. */
  public A096022() {
    super(1, new long[] {-1, 1, 0, 0, 1}, new long[] {15, 27, 39, 51, 75});
  }
}
