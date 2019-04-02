package irvine.oeis.a029;

import irvine.oeis.LinearRecurrence;

/**
 * A029074 Expansion of 1/((1-x)(1-x^4)(1-x^7)(1-x^9)).
 * @author Sean A. Irvine
 */
public class A029074 extends LinearRecurrence {

  /** Construct the sequence. */
  public A029074() {
    super(new long[] {-1, 1, 0, 0, 1, -1, 0, 1, -1, 1, -1, -1, 1, -1, 1, 0, -1, 1, 0, 0, 1}, new long[] {1, 1, 1, 1, 2, 2, 2, 3, 4, 5, 5, 6, 7, 8, 9, 10, 12, 13, 15, 16, 18});
  }
}
