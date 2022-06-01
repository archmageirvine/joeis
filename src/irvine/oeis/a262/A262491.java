package irvine.oeis.a262;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A262491 The index of the first of two consecutive positive triangular numbers (A000217) the sum of which is equal to the sum of eleven consecutive positive triangular numbers.
 * @author Sean A. Irvine
 */
public class A262491 extends LinearRecurrence {

  /** Construct the sequence. */
  public A262491() {
    super(new long[] {1, -1, 0, 0, -394, 394, 0, 0, 1}, new long[] {43, 120, 549, 3783, 17214, 47629, 216688, 1490884, 6782665});
  }
}
