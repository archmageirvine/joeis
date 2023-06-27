package irvine.oeis.a230;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A230240 Values of N for which the equation x^2 - 9*y^2 = N has integer solutions.
 * @author Sean A. Irvine
 */
public class A230240 extends LinearRecurrence {

  /** Construct the sequence. */
  public A230240() {
    super(1, new long[] {-1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1}, new long[] {0, 1, 4, 7, 9, 13, 16, 19, 25, 27, 28, 31, 36});
  }
}
