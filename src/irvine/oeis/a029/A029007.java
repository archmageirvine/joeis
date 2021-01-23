package irvine.oeis.a029;

import irvine.oeis.LinearRecurrence;

/**
 * A029007 Expansion of 1/((1-x)(1-x^2)(1-x^4)(1-x^5)).
 * @author Sean A. Irvine
 */
public class A029007 extends LinearRecurrence {

  /** Construct the sequence. */
  public A029007() {
    super(new long[] {-1, 1, 1, -1, 1, 0, -2, 0, 1, -1, 1, 1}, new long[] {1, 1, 2, 2, 4, 5, 7, 8, 11, 13, 17, 19});
  }
}
