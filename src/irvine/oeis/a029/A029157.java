package irvine.oeis.a029;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A029157 Expansion of 1/((1-x^2)(1-x^3)(1-x^7)(1-x^9)).
 * @author Sean A. Irvine
 */
public class A029157 extends LinearRecurrence {

  /** Construct the sequence. */
  public A029157() {
    super(new long[] {-1, 0, 1, 1, 0, -1, 0, 1, 0, 0, -1, -1, 0, 0, 1, 0, -1, 0, 1, 1, 0}, new long[] {1, 0, 1, 1, 1, 1, 2, 2, 2, 4, 3, 4, 5, 5, 6, 7, 8, 8, 11, 10, 12});
  }
}
