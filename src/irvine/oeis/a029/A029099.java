package irvine.oeis.a029;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A029099 Expansion of 1/((1-x)(1-x^5)(1-x^8)(1-x^12)).
 * @author Sean A. Irvine
 */
public class A029099 extends LinearRecurrence {

  /** Construct the sequence. */
  public A029099() {
    super(new long[] {-1, 1, 0, 0, 0, 1, -1, 0, 1, -1, 0, 0, 1, -2, 1, 0, 0, -1, 1, 0, -1, 1, 0, 0, 0, 1}, new long[] {1, 1, 1, 1, 1, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 7, 8, 9, 10, 10, 12, 13, 14, 15, 17, 19});
  }
}
