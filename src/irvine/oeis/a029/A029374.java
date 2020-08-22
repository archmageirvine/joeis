package irvine.oeis.a029;

import irvine.oeis.LinearRecurrence;

/**
 * A029374 Expansion of 1/((1-x^4)(1-x^9)(1-x^10)(1-x^11)).
 * @author Sean A. Irvine
 */
public class A029374 extends LinearRecurrence {

  /** Construct the sequence. */
  public A029374() {
    super(new long[] {-1, 0, 0, 0, 1, 0, 0, 0, 0, 1, 1, 1, 0, -1, -1, -1, 0, 0, 0, -1, -1, -1, 0, 1, 1, 1, 0, 0, 0, 0, 1, 0, 0, 0}, new long[] {1, 0, 0, 0, 1, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 3, 2, 3, 2, 3, 2, 3, 3, 4, 4, 5, 5, 5, 5});
  }
}
