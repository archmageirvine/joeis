package irvine.oeis.a029;

import irvine.oeis.LinearRecurrence;

/**
 * A029095 Expansion of 1/((1-x)*(1-x^5)*(1-x^7)*(1-x^12)).
 * @author Sean A. Irvine
 */
public class A029095 extends LinearRecurrence {

  /** Construct the sequence. */
  public A029095() {
    super(new long[] {-1, 1, 0, 0, 0, 1, -1, 1, -1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 1, -1, 1, 0, 0, 0, 1}, new long[] {1, 1, 1, 1, 1, 2, 2, 3, 3, 3, 4, 4, 6, 6, 7, 8, 8, 10, 10, 12, 13, 14, 16, 16, 19});
  }
}
