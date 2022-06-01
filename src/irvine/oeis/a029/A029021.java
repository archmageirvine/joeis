package irvine.oeis.a029;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A029021 Expansion of 1/((1-x)(1-x^2)(1-x^7)(1-x^9)).
 * @author Sean A. Irvine
 */
public class A029021 extends LinearRecurrence {

  /** Construct the sequence. */
  public A029021() {
    super(new long[] {-1, 1, 1, -1, 0, 0, 0, 1, -1, 0, 0, -1, 1, 0, 0, 0, -1, 1, 1}, new long[] {1, 1, 2, 2, 3, 3, 4, 5, 6, 8, 9, 11, 12, 14, 16, 18, 21, 23, 27});
  }
}
