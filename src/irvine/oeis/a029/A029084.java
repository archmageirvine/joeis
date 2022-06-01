package irvine.oeis.a029;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A029084 Expansion of 1/((1-x)(1-x^4)(1-x^11)(1-x^12)).
 * @author Sean A. Irvine
 */
public class A029084 extends LinearRecurrence {

  /** Construct the sequence. */
  public A029084() {
    super(new long[] {-1, 1, 0, 0, 1, -1, 0, 0, 0, 0, 0, 1, 0, -1, 0, -1, 0, 1, 0, 0, 0, 0, 0, -1, 1, 0, 0, 1}, new long[] {1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 4, 6, 6, 6, 7, 9, 9, 9, 10, 12, 12, 13, 15, 18, 18, 19, 21});
  }
}
