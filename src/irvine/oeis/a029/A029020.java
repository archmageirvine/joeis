package irvine.oeis.a029;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A029020 Expansion of 1/((1-x)(1-x^2)(1-x^7)(1-x^8)).
 * @author Sean A. Irvine
 */
public class A029020 extends LinearRecurrence {

  /** Construct the sequence. */
  public A029020() {
    super(new long[] {-1, 1, 1, -1, 0, 0, 0, 1, 0, -2, 0, 1, 0, 0, 0, -1, 1, 1}, new long[] {1, 1, 2, 2, 3, 3, 4, 5, 7, 8, 10, 11, 13, 14, 17, 19, 23, 25});
  }
}
