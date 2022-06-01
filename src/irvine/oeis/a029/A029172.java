package irvine.oeis.a029;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A029172 Expansion of 1/((1-x^2)(1-x^4)(1-x^5)(1-x^7)).
 * @author Sean A. Irvine
 */
public class A029172 extends LinearRecurrence {

  /** Construct the sequence. */
  public A029172() {
    super(new long[] {-1, 0, 1, 0, 1, 1, -1, 0, 0, -2, 0, 0, -1, 1, 1, 0, 1, 0}, new long[] {1, 0, 1, 0, 2, 1, 2, 2, 3, 3, 4, 4, 6, 5, 8, 7, 10, 9});
  }
}
