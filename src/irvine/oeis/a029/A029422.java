package irvine.oeis.a029;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A029422 Expansion of 1/((1-x^6)(1-x^7)(1-x^11)(1-x^12)).
 * @author Sean A. Irvine
 */
public class A029422 extends LinearRecurrence {

  /** Construct the sequence. */
  public A029422() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 1, 1, -1, 0, 0, 0, -1, -2, -1, 0, 0, 0, -1, 1, 1, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0}, new long[] {1, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 1, 2, 1, 1, 0, 0, 1, 3, 2, 1, 1, 1, 2, 4, 3, 2, 1, 2, 3, 5, 4, 3, 3, 3, 5});
  }
}
