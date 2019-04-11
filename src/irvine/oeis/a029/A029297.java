package irvine.oeis.a029;

import irvine.oeis.LinearRecurrence;

/**
 * A029297 Expansion of <code>1/((1-x^3)(1-x^6)(1-x^8)(1-x^9))</code>.
 * @author Sean A. Irvine
 */
public class A029297 extends LinearRecurrence {

  /** Construct the sequence. */
  public A029297() {
    super(new long[] {-1, 0, 0, 1, 0, 0, 1, 0, 1, 0, 0, -1, -1, 0, -1, -1, 0, 0, 1, 0, 1, 0, 0, 1, 0, 0}, new long[] {1, 0, 0, 1, 0, 0, 2, 0, 1, 3, 0, 1, 4, 0, 2, 5, 1, 3, 7, 1, 4, 8, 2, 5, 11, 3});
  }
}
