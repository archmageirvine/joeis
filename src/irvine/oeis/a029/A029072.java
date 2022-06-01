package irvine.oeis.a029;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A029072 Expansion of 1/((1-x)(1-x^4)(1-x^6)(1-x^11)).
 * @author Sean A. Irvine
 */
public class A029072 extends LinearRecurrence {

  /** Construct the sequence. */
  public A029072() {
    super(new long[] {-1, 1, 0, 0, 1, -1, 1, -1, 0, 0, -1, 2, -1, 0, 0, -1, 1, -1, 1, 0, 0, 1}, new long[] {1, 1, 1, 1, 2, 2, 3, 3, 4, 4, 5, 6, 8, 8, 9, 10, 12, 13, 15, 16, 18, 19});
  }
}
