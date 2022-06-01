package irvine.oeis.a029;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A029167 Expansion of 1/((1-x^2)(1-x^3)(1-x^9)(1-x^12)).
 * @author Sean A. Irvine
 */
public class A029167 extends LinearRecurrence {

  /** Construct the sequence. */
  public A029167() {
    super(new long[] {-1, 0, 1, 1, 0, -1, 0, 0, 0, 1, 0, -1, 0, 0, 0, -1, 0, 1, 0, 0, 0, -1, 0, 1, 1, 0}, new long[] {1, 0, 1, 1, 1, 1, 2, 1, 2, 3, 2, 3, 5, 3, 5, 6, 5, 6, 9, 6, 9, 11, 9, 11, 15, 11});
  }
}
