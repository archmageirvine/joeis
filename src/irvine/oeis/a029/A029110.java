package irvine.oeis.a029;

import irvine.oeis.LinearRecurrence;

/**
 * A029110 Expansion of 1/((1-x)(1-x^6)(1-x^7)(1-x^12)).
 * @author Sean A. Irvine
 */
public class A029110 extends LinearRecurrence {

  /** Construct the sequence. */
  public A029110() {
    super(new long[] {-1, 1, 0, 0, 0, 0, 1, 0, -1, 0, 0, 0, 1, -2, 1, 0, 0, 0, -1, 0, 1, 0, 0, 0, 0, 1}, new long[] {1, 1, 1, 1, 1, 1, 2, 3, 3, 3, 3, 3, 5, 6, 7, 7, 7, 7, 9, 11, 12, 13, 13, 13, 16, 18});
  }
}
