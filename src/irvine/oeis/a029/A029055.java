package irvine.oeis.a029;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A029055 Expansion of 1/((1-x)*(1-x^3)*(1-x^8)*(1-x^10)).
 * @author Sean A. Irvine
 */
public class A029055 extends LinearRecurrence {

  /** Construct the sequence. */
  public A029055() {
    super(new long[] {-1, 1, 0, 1, -1, 0, 0, 0, 1, -1, 1, -2, 1, -1, 1, 0, 0, 0, -1, 1, 0, 1}, new long[] {1, 1, 1, 2, 2, 2, 3, 3, 4, 5, 6, 7, 8, 9, 10, 11, 13, 14, 16, 18, 20, 22});
  }
}
