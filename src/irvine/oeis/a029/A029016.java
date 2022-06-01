package irvine.oeis.a029;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A029016 Expansion of 1/((1-x)(1-x^2)(1-x^5)(1-x^12)).
 * @author Sean A. Irvine
 */
public class A029016 extends LinearRecurrence {

  /** Construct the sequence. */
  public A029016() {
    super(new long[] {-1, 1, 1, -1, 0, 1, -1, -1, 1, 0, 0, 0, 1, -1, -1, 1, 0, -1, 1, 1}, new long[] {1, 1, 2, 2, 3, 4, 5, 6, 7, 8, 10, 11, 14, 15, 18, 20, 23, 26, 29, 32});
  }
}
