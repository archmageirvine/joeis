package irvine.oeis.a262;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A262490 The index of the first of two consecutive positive triangular numbers (A000217) the sum of which is equal to the sum of four consecutive positive triangular numbers.
 * @author Sean A. Irvine
 */
public class A262490 extends LinearRecurrence {

  /** Construct the sequence. */
  public A262490() {
    super(1, new long[] {1, -7, 7}, new long[] {9, 57, 337});
  }
}
