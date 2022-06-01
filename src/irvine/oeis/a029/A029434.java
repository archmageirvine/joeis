package irvine.oeis.a029;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A029434 Expansion of 1/((1-x^7)(1-x^8)(1-x^9)(1-x^12)).
 * @author Sean A. Irvine
 */
public class A029434 extends LinearRecurrence {

  /** Construct the sequence. */
  public A029434() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 1, 0, 0, -1, -1, -1, 0, -1, -1, -1, 0, 0, 1, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0}, new long[] {1, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 1, 0, 1, 1, 2, 1, 1, 1, 1, 2, 1, 2, 3, 2, 2, 2, 3, 2, 3, 3, 4, 4, 3, 4});
  }
}
