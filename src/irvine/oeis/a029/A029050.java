package irvine.oeis.a029;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A029050 Expansion of 1/((1-x)(1-x^3)(1-x^7)(1-x^9)).
 * @author Sean A. Irvine
 */
public class A029050 extends LinearRecurrence {

  /** Construct the sequence. */
  public A029050() {
    super(new long[] {-1, 1, 0, 1, -1, 0, 0, 1, -1, 1, -2, 1, -1, 1, 0, 0, -1, 1, 0, 1}, new long[] {1, 1, 1, 2, 2, 2, 3, 4, 4, 6, 7, 7, 9, 10, 11, 13, 15, 16, 19, 21});
  }
}
