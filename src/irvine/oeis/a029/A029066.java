package irvine.oeis.a029;

import irvine.oeis.LinearRecurrence;

/**
 * A029066 Expansion of 1/((1-x)*(1-x^4)*(1-x^5)*(1-x^9)).
 * @author Sean A. Irvine
 */
public class A029066 extends LinearRecurrence {

  /** Construct the sequence. */
  public A029066() {
    super(new long[] {-1, 1, 0, 0, 1, 0, -1, 0, 0, 0, 0, 0, 0, -1, 0, 1, 0, 0, 1}, new long[] {1, 1, 1, 1, 2, 3, 3, 3, 4, 6, 7, 7, 8, 10, 12, 13, 14, 16, 19});
  }
}
