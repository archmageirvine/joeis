package irvine.oeis.a029;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A029018 Expansion of 1/((1-x)(1-x^2)(1-x^6)(1-x^9)).
 * @author Sean A. Irvine
 */
public class A029018 extends LinearRecurrence {

  /** Construct the sequence. */
  public A029018() {
    super(new long[] {-1, 1, 1, -1, 0, 0, 1, -1, -1, 2, -1, -1, 1, 0, 0, -1, 1, 1}, new long[] {1, 1, 2, 2, 3, 3, 5, 5, 7, 8, 10, 11, 14, 15, 18, 20, 23, 25});
  }
}
