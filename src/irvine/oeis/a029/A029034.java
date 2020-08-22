package irvine.oeis.a029;

import irvine.oeis.LinearRecurrence;

/**
 * A029034 Expansion of 1/((1-x)(1-x^3)(1-x^4)(1-x^8)).
 * @author Sean A. Irvine
 */
public class A029034 extends LinearRecurrence {

  /** Construct the sequence. */
  public A029034() {
    super(new long[] {-1, 1, 0, 1, 0, -1, 0, -1, 2, -1, 0, -1, 0, 1, 0, 1}, new long[] {1, 1, 1, 2, 3, 3, 4, 5, 7, 8, 9, 11, 14, 15, 17, 20});
  }
}
