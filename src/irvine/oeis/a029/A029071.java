package irvine.oeis.a029;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A029071 Expansion of 1/((1-x)(1-x^4)(1-x^6)(1-x^9)).
 * @author Sean A. Irvine
 */
public class A029071 extends LinearRecurrence {

  /** Construct the sequence. */
  public A029071() {
    super(new long[] {-1, 1, 0, 0, 1, -1, 1, -1, 0, 1, -2, 1, 0, -1, 1, -1, 1, 0, 0, 1}, new long[] {1, 1, 1, 1, 2, 2, 3, 3, 4, 5, 6, 6, 8, 9, 10, 11, 13, 14, 17, 18});
  }
}
