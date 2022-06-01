package irvine.oeis.a029;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A029196 Expansion of 1/((1-x^2)(1-x^5)(1-x^6)(1-x^10)).
 * @author Sean A. Irvine
 */
public class A029196 extends LinearRecurrence {

  /** Construct the sequence. */
  public A029196() {
    super(new long[] {-1, 0, 1, 0, 0, 1, 1, -1, -1, 0, 1, -1, -1, 1, 0, -1, -1, 1, 1, 0, 0, 1, 0}, new long[] {1, 0, 1, 0, 1, 1, 2, 1, 2, 1, 4, 2, 5, 2, 5, 4, 7, 5, 8, 5, 11, 7, 13});
  }
}
