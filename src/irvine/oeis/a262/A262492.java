package irvine.oeis.a262;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A262492 The index of the first of two consecutive positive triangular numbers (A000217) the sum of which is equal to the sum of thirteen consecutive positive triangular numbers.
 * @author Sean A. Irvine
 */
public class A262492 extends LinearRecurrence {

  /** Construct the sequence. */
  public A262492() {
    super(new long[] {1, -1, 0, 0, -102, 102, 0, 0, 1}, new long[] {25, 90, 207, 1117, 2560, 9255, 21202, 114022, 261195});
  }
}
