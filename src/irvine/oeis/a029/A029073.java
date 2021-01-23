package irvine.oeis.a029;

import irvine.oeis.LinearRecurrence;

/**
 * A029073 Expansion of 1/((1-x)(1-x^4)(1-x^7)(1-x^8)).
 * @author Sean A. Irvine
 */
public class A029073 extends LinearRecurrence {

  /** Construct the sequence. */
  public A029073() {
    super(new long[] {-1, 1, 0, 0, 1, -1, 0, 1, 0, -1, 0, -1, 0, 1, 0, -1, 1, 0, 0, 1}, new long[] {1, 1, 1, 1, 2, 2, 2, 3, 5, 5, 5, 6, 8, 8, 9, 11, 14, 14, 15, 17});
  }
}
