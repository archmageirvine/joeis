package irvine.oeis.a029;

import irvine.oeis.LinearRecurrence;

/**
 * A029029 Expansion of <code>1/((1-x)(1-x^2)(1-x^9)(1-x^12))</code>.
 * @author Sean A. Irvine
 */
public class A029029 extends LinearRecurrence {

  /** Construct the sequence. */
  public A029029() {
    super(new long[] {-1, 1, 1, -1, 0, 0, 0, 0, 0, 1, -1, -1, 2, -1, -1, 1, 0, 0, 0, 0, 0, -1, 1, 1}, new long[] {1, 1, 2, 2, 3, 3, 4, 4, 5, 6, 7, 8, 10, 11, 13, 14, 16, 17, 20, 21, 24, 26, 29, 31});
  }
}
