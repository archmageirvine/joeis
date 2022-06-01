package irvine.oeis.a074;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A074232 Positive numbers that are not 3 or 6 (mod 9).
 * @author Sean A. Irvine
 */
public class A074232 extends LinearRecurrence {

  /** Construct the sequence. */
  public A074232() {
    super(new long[] {-1, 1, 0, 0, 0, 0, 0, 1}, new long[] {1, 2, 4, 5, 7, 8, 9, 10});
  }
}
