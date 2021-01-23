package irvine.oeis.a029;

import irvine.oeis.LinearRecurrence;

/**
 * A029063 Expansion of 1/((1-x)*(1-x^4)*(1-x^5)*(1-x^6)).
 * @author Sean A. Irvine
 */
public class A029063 extends LinearRecurrence {

  /** Construct the sequence. */
  public A029063() {
    super(new long[] {-1, 1, 0, 0, 1, 0, 0, -1, 0, -1, 0, 0, 1, 0, 0, 1}, new long[] {1, 1, 1, 1, 2, 3, 4, 4, 5, 6, 8, 9, 11, 12, 14, 16});
  }
}
