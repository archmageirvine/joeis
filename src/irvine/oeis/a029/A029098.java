package irvine.oeis.a029;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A029098 Expansion of 1/((1-x)(1-x^5)(1-x^8)(1-x^11)).
 * @author Sean A. Irvine
 */
public class A029098 extends LinearRecurrence {

  /** Construct the sequence. */
  public A029098() {
    super(new long[] {-1, 1, 0, 0, 0, 1, -1, 0, 1, -1, 0, 1, -1, -1, 1, 0, -1, 1, 0, -1, 1, 0, 0, 0, 1}, new long[] {1, 1, 1, 1, 1, 2, 2, 2, 3, 3, 4, 5, 5, 6, 6, 7, 9, 9, 10, 11, 12, 14, 15, 16, 18});
  }
}
