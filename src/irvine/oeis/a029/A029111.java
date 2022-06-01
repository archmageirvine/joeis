package irvine.oeis.a029;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A029111 Expansion of 1/((1-x)(1-x^6)(1-x^8)(1-x^9)).
 * @author Sean A. Irvine
 */
public class A029111 extends LinearRecurrence {

  /** Construct the sequence. */
  public A029111() {
    super(new long[] {-1, 1, 0, 0, 0, 0, 1, -1, 1, 0, -1, 0, 0, 0, -1, 0, 1, -1, 1, 0, 0, 0, 0, 1}, new long[] {1, 1, 1, 1, 1, 1, 2, 2, 3, 4, 4, 4, 5, 5, 6, 7, 8, 9, 11, 11, 12, 13, 14, 15});
  }
}
