package irvine.oeis.a029;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A029014 Expansion of 1/((1-x)(1-x^2)(1-x^5)(1-x^9)).
 * @author Sean A. Irvine
 */
public class A029014 extends LinearRecurrence {

  /** Construct the sequence. */
  public A029014() {
    super(new long[] {-1, 1, 1, -1, 0, 1, -1, -1, 1, 1, -1, -1, 1, 0, -1, 1, 1}, new long[] {1, 1, 2, 2, 3, 4, 5, 6, 7, 9, 11, 13, 15, 17, 20, 23, 26});
  }
}
