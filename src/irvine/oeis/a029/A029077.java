package irvine.oeis.a029;

import irvine.oeis.LinearRecurrence;

/**
 * A029077 Expansion of 1/((1-x)(1-x^4)(1-x^7)(1-x^12)).
 * @author Sean A. Irvine
 */
public class A029077 extends LinearRecurrence {

  /** Construct the sequence. */
  public A029077() {
    super(new long[] {-1, 1, 0, 0, 1, -1, 0, 1, -1, 0, 0, -1, 2, -1, 0, 0, -1, 1, 0, -1, 1, 0, 0, 1}, new long[] {1, 1, 1, 1, 2, 2, 2, 3, 4, 4, 4, 5, 7, 7, 8, 9, 11, 11, 12, 14, 16, 17, 18, 20});
  }
}
