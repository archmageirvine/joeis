package irvine.oeis.a029;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A029013 Expansion of 1/((1-x)(1-x^2)(1-x^5)(1-x^8)).
 * @author Sean A. Irvine
 */
public class A029013 extends LinearRecurrence {

  /** Construct the sequence. */
  public A029013() {
    super(new long[] {-1, 1, 1, -1, 0, 1, -1, -1, 2, -1, -1, 1, 0, -1, 1, 1}, new long[] {1, 1, 2, 2, 3, 4, 5, 6, 8, 9, 12, 13, 16, 18, 21, 24});
  }
}
