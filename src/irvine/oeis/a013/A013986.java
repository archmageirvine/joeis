package irvine.oeis.a013;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A013986 Expansion of 1/(1-x^2-x^3-x^4-x^5-x^6-x^7-x^8-x^9).
 * @author Sean A. Irvine
 */
public class A013986 extends LinearRecurrence {

  /** Construct the sequence. */
  public A013986() {
    super(new long[] {1, 1, 1, 1, 1, 1, 1, 1, 0}, new long[] {1, 0, 1, 1, 2, 3, 5, 8, 13});
  }
}
