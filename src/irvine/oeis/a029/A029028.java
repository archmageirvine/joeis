package irvine.oeis.a029;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A029028 Expansion of 1/((1-x)(1-x^2)(1-x^9)(1-x^11)).
 * @author Sean A. Irvine
 */
public class A029028 extends LinearRecurrence {

  /** Construct the sequence. */
  public A029028() {
    super(new long[] {-1, 1, 1, -1, 0, 0, 0, 0, 0, 1, -1, 0, 0, -1, 1, 0, 0, 0, 0, 0, -1, 1, 1}, new long[] {1, 1, 2, 2, 3, 3, 4, 4, 5, 6, 7, 9, 10, 12, 13, 15, 16, 18, 20, 22, 25, 27, 31});
  }
}
