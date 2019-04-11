package irvine.oeis.a029;

import irvine.oeis.LinearRecurrence;

/**
 * A029306 Expansion of <code>1/((1-x^3)(1-x^7)(1-x^8)(1-x^9))</code>.
 * @author Sean A. Irvine
 */
public class A029306 extends LinearRecurrence {

  /** Construct the sequence. */
  public A029306() {
    super(new long[] {-1, 0, 0, 1, 0, 0, 0, 1, 1, 1, -1, -1, -1, 0, 0, -1, -1, -1, 1, 1, 1, 0, 0, 0, 1, 0, 0}, new long[] {1, 0, 0, 1, 0, 0, 1, 1, 1, 2, 1, 1, 2, 1, 2, 3, 3, 3, 4, 3, 3, 5, 4, 5, 7, 6, 6});
  }
}
