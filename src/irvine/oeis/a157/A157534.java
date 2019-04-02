package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157534 Half the number of length n integer sequences with sum zero and sum of squares 8.
 * @author Sean A. Irvine
 */
public class A157534 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157534() {
    super(new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9}, new long[] {1, 3, 6, 30, 135, 441, 1183, 2871, 6660});
  }
}
