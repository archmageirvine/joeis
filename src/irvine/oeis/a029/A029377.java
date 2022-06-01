package irvine.oeis.a029;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A029377 Expansion of 1/((1-x^4)(1-x^10)(1-x^11)(1-x^12)).
 * @author Sean A. Irvine
 */
public class A029377 extends LinearRecurrence {

  /** Construct the sequence. */
  public A029377() {
    super(new long[] {-1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 1, 1, 0, -1, -1, -1, 0, 0, 0, 0, -1, -1, -1, 0, 1, 1, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0}, new long[] {1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 1, 2, 0, 1, 1, 2, 0, 1, 1, 3, 1, 3, 2, 4, 1, 3, 2, 4, 1, 4, 3, 6, 3, 6, 4, 7});
  }
}
