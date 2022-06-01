package irvine.oeis.a029;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A029153 Expansion of 1/((1-x^2)(1-x^3)(1-x^6)(1-x^10)).
 * @author Sean A. Irvine
 */
public class A029153 extends LinearRecurrence {

  /** Construct the sequence. */
  public A029153() {
    super(new long[] {-1, 0, 1, 1, 0, -1, 1, 0, -1, -1, 1, 1, -1, -1, 0, 1, -1, 0, 1, 1, 0}, new long[] {1, 0, 1, 1, 1, 1, 3, 1, 3, 3, 4, 3, 7, 4, 7, 7, 9, 7, 13, 9, 14});
  }
}
