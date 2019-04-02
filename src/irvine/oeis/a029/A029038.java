package irvine.oeis.a029;

import irvine.oeis.LinearRecurrence;

/**
 * A029038 Expansion of 1/((1-x)(1-x^3)(1-x^4)(1-x^12)).
 * @author Sean A. Irvine
 */
public class A029038 extends LinearRecurrence {

  /** Construct the sequence. */
  public A029038() {
    super(new long[] {-1, 1, 0, 1, 0, -1, 0, -1, 1, 0, 0, 0, 1, -1, 0, -1, 0, 1, 0, 1}, new long[] {1, 1, 1, 2, 3, 3, 4, 5, 6, 7, 8, 9, 12, 13, 14, 17, 20, 21, 24, 27});
  }
}
