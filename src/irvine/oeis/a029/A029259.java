package irvine.oeis.a029;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A029259 Expansion of 1/((1-x^3)(1-x^4)(1-x^7)(1-x^10)).
 * @author Sean A. Irvine
 */
public class A029259 extends LinearRecurrence {

  /** Construct the sequence. */
  public A029259() {
    super(new long[] {-1, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, -1, 0, -1, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0}, new long[] {1, 0, 0, 1, 1, 0, 1, 2, 1, 1, 3, 2, 2, 3, 4, 3, 4, 5, 5, 5, 7, 7, 7, 8});
  }
}
