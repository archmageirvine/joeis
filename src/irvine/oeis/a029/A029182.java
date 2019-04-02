package irvine.oeis.a029;

import irvine.oeis.LinearRecurrence;

/**
 * A029182 Expansion of 1/((1-x^2)(1-x^4)(1-x^7)(1-x^9)).
 * @author Sean A. Irvine
 */
public class A029182 extends LinearRecurrence {

  /** Construct the sequence. */
  public A029182() {
    super(new long[] {-1, 0, 1, 0, 1, 0, -1, 1, 0, 0, 0, -2, 0, 0, 0, 1, -1, 0, 1, 0, 1, 0}, new long[] {1, 0, 1, 0, 2, 0, 2, 1, 3, 2, 3, 3, 4, 4, 5, 5, 7, 6, 9, 7, 11, 9});
  }
}
