package irvine.oeis.a029;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A029100 Expansion of 1/((1-x)(1-x^5)(1-x^9)(1-x^10)).
 * @author Sean A. Irvine
 */
public class A029100 extends LinearRecurrence {

  /** Construct the sequence. */
  public A029100() {
    super(new long[] {-1, 1, 0, 0, 0, 1, -1, 0, 0, 1, 0, -1, 0, 0, -1, 0, 1, 0, 0, -1, 1, 0, 0, 0, 1}, new long[] {1, 1, 1, 1, 1, 2, 2, 2, 2, 3, 5, 5, 5, 5, 6, 8, 8, 8, 9, 11, 14, 14, 14, 15, 17});
  }
}
