package irvine.oeis.a200;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A200407 The x-values in the solution to 19*x^2 - 18 = y^2.
 * @author Sean A. Irvine
 */
public class A200407 extends LinearRecurrence {

  /** Construct the sequence. */
  public A200407() {
    super(1, new long[] {-1, 0, 0, 340, 0, 0}, new long[] {1, 9, 131, 209, 3051, 44539});
  }
}
