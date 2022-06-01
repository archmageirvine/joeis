package irvine.oeis.a029;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A029069 Expansion of 1/((1-x)*(1-x^4)*(1-x^5)*(1-x^12)).
 * @author Sean A. Irvine
 */
public class A029069 extends LinearRecurrence {

  /** Construct the sequence. */
  public A029069() {
    super(new long[] {-1, 1, 0, 0, 1, 0, -1, 0, 0, -1, 1, 0, 1, -1, 0, 0, -1, 0, 1, 0, 0, 1}, new long[] {1, 1, 1, 1, 2, 3, 3, 3, 4, 5, 6, 6, 8, 9, 10, 11, 13, 15, 16, 17, 20, 22});
  }
}
