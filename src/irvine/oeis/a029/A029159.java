package irvine.oeis.a029;

import irvine.oeis.LinearRecurrence;

/**
 * A029159 Expansion of 1/((1-x^2)(1-x^3)(1-x^7)(1-x^11)).
 * @author Sean A. Irvine
 */
public class A029159 extends LinearRecurrence {

  /** Construct the sequence. */
  public A029159() {
    super(new long[] {-1, 0, 1, 1, 0, -1, 0, 1, 0, -1, -1, 1, 1, -1, -1, 0, 1, 0, -1, 0, 1, 1, 0}, new long[] {1, 0, 1, 1, 1, 1, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 7, 8, 9, 9, 11, 12, 13});
  }
}
