package irvine.oeis.a029;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A029134 Expansion of 1/((1-x)(1-x^9)(1-x^11)(1-x^12)).
 * @author Sean A. Irvine
 */
public class A029134 extends LinearRecurrence {

  /** Construct the sequence. */
  public A029134() {
    super(new long[] {-1, 1, 0, 0, 0, 0, 0, 0, 0, 1, -1, 1, 0, -1, 0, 0, 0, 0, 0, 0, -1, 0, 1, -1, 1, 0, 0, 0, 0, 0, 0, 0, 1}, new long[] {1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 3, 4, 4, 4, 4, 4, 4, 5, 5, 6, 7, 8, 9, 10, 10, 10, 11, 11, 12, 13, 14, 15});
  }
}
