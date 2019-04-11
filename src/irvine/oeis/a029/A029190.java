package irvine.oeis.a029;

import irvine.oeis.LinearRecurrence;

/**
 * A029190 Expansion of <code>1/((1-x^2)(1-x^4)(1-x^9)(1-x^12))</code>.
 * @author Sean A. Irvine
 */
public class A029190 extends LinearRecurrence {

  /** Construct the sequence. */
  public A029190() {
    super(new long[] {-1, 0, 1, 0, 1, 0, -1, 0, 0, 1, 0, -1, 1, -1, -1, 1, -1, 0, 1, 0, 0, -1, 0, 1, 0, 1, 0}, new long[] {1, 0, 1, 0, 2, 0, 2, 0, 3, 1, 3, 1, 5, 2, 5, 2, 7, 3, 8, 3, 10, 5, 11, 5, 14, 7, 15});
  }
}
