package irvine.oeis.a029;

import irvine.oeis.LinearRecurrence;

/**
 * A029120 Expansion of 1/((1-x)(1-x^7)(1-x^8)(1-x^12)).
 * @author Sean A. Irvine
 */
public class A029120 extends LinearRecurrence {

  /** Construct the sequence. */
  public A029120() {
    super(new long[] {-1, 1, 0, 0, 0, 0, 0, 1, 0, -1, 0, 0, 1, -1, 0, -1, 1, 0, 0, -1, 0, 1, 0, 0, 0, 0, 0, 1}, new long[] {1, 1, 1, 1, 1, 1, 1, 2, 3, 3, 3, 3, 4, 4, 5, 6, 7, 7, 7, 8, 9, 10, 11, 12, 14, 14, 15, 16});
  }
}
