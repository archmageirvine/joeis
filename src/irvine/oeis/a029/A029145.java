package irvine.oeis.a029;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A029145 Expansion of 1/((1-x^2)(1-x^3)(1-x^5)(1-x^8)).
 * @author Sean A. Irvine
 */
public class A029145 extends LinearRecurrence {

  /** Construct the sequence. */
  public A029145() {
    super(new long[] {-1, 0, 1, 1, 0, 0, 0, -1, 0, 0, 0, -1, 0, 0, 0, 1, 1, 0}, new long[] {1, 0, 1, 1, 1, 2, 2, 2, 4, 3, 5, 5, 6, 7, 8, 9, 11, 11});
  }
}
