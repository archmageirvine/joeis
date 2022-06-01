package irvine.oeis.a029;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A029054 Expansion of 1/((1-x)*(1-x^3)*(1-x^8)*(1-x^9)).
 * @author Sean A. Irvine
 */
public class A029054 extends LinearRecurrence {

  /** Construct the sequence. */
  public A029054() {
    super(new long[] {-1, 1, 0, 1, -1, 0, 0, 0, 1, 0, -1, -1, 0, 1, 0, 0, 0, -1, 1, 0, 1}, new long[] {1, 1, 1, 2, 2, 2, 3, 3, 4, 6, 6, 7, 9, 9, 10, 12, 13, 15, 18, 19, 21});
  }
}
