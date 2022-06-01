package irvine.oeis.a225;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A225396 Expansion of 1/(1 - x - x^2 + x^10 - x^12).
 * @author Sean A. Irvine
 */
public class A225396 extends LinearRecurrence {

  /** Construct the sequence. */
  public A225396() {
    super(new long[] {1, 0, -1, 0, 0, 0, 0, 0, 0, 0, 1, 1}, new long[] {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 88, 142});
  }
}
