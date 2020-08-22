package irvine.oeis.a288;

import irvine.oeis.LinearRecurrence;

/**
 * A288166 Expansion of x^5/((1-x^5)*(1-x^4)*(1-x^8)*(1-x^12)*(1-x^16)).
 * @author Sean A. Irvine
 */
public class A288166 extends LinearRecurrence {

  /** Construct the sequence. */
  public A288166() {
    super(new long[] {1, 0, 0, 0, -1, -1, 0, 0, -1, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, -1, 1, 0, 0, 1, 1, 0, 0, 0}, new long[] {0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0, 2, 1, 1, 0, 3, 2, 1, 1, 5, 3, 2, 1, 7, 5, 3, 2, 10, 7, 5, 3, 13, 10, 7, 5, 18, 13, 10, 7, 23, 18, 13, 10});
  }
}
