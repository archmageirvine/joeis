package irvine.oeis.a029;

import irvine.oeis.LinearRecurrence;

/**
 * A029188 Expansion of <code>1/((1-x^2)(1-x^4)(1-x^9)(1-x^10))</code>.
 * @author Sean A. Irvine
 */
public class A029188 extends LinearRecurrence {

  /** Construct the sequence. */
  public A029188() {
    super(new long[] {-1, 0, 1, 0, 1, 0, -1, 0, 0, 1, 1, -1, -1, -1, -1, 1, 1, 0, 0, -1, 0, 1, 0, 1, 0}, new long[] {1, 0, 1, 0, 2, 0, 2, 0, 3, 1, 4, 1, 5, 2, 6, 2, 7, 3, 9, 4, 11, 5, 13, 6, 15});
  }
}
