package irvine.oeis.a262;

import irvine.oeis.LinearRecurrence;

/**
 * A262489 The index of the first of two consecutive positive triangular numbers <code>(A000217)</code> the sum of which is equal to the sum of three consecutive positive triangular numbers.
 * @author Sean A. Irvine
 */
public class A262489 extends LinearRecurrence {

  /** Construct the sequence. */
  public A262489() {
    super(new long[] {1, -1, -10, 10, 1}, new long[] {7, 18, 78, 187, 781});
  }
}
