package irvine.oeis.a029;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A029033 Expansion of 1/((1-x)(1-x^3)(1-x^4)(1-x^7)).
 * @author Sean A. Irvine
 */
public class A029033 extends LinearRecurrence {

  /** Construct the sequence. */
  public A029033() {
    super(new long[] {-1, 1, 0, 1, 0, -1, 0, 0, 0, 0, -1, 0, 1, 0, 1}, new long[] {1, 1, 1, 2, 3, 3, 4, 6, 7, 8, 10, 12, 14, 16, 19});
  }
}
