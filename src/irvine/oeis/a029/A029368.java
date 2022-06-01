package irvine.oeis.a029;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A029368 Expansion of 1/((1-x^4)(1-x^7)(1-x^11)(1-x^12)).
 * @author Sean A. Irvine
 */
public class A029368 extends LinearRecurrence {

  /** Construct the sequence. */
  public A029368() {
    super(new long[] {-1, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, -1, -1, 0, -1, -1, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0}, new long[] {1, 0, 0, 0, 1, 0, 0, 1, 1, 0, 0, 2, 2, 0, 1, 2, 2, 0, 2, 3, 2, 1, 3, 4, 3, 2, 4, 4, 4, 3, 5, 5, 5, 5});
  }
}
