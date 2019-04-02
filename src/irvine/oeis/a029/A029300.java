package irvine.oeis.a029;

import irvine.oeis.LinearRecurrence;

/**
 * A029300 Expansion of 1/((1-x^3)(1-x^6)(1-x^8)(1-x^12)).
 * @author Sean A. Irvine
 */
public class A029300 extends LinearRecurrence {

  /** Construct the sequence. */
  public A029300() {
    super(new long[] {-1, 0, 0, 1, 0, 0, 1, 0, 1, -1, 0, -1, 1, 0, -1, -1, 0, 1, -1, 0, -1, 1, 0, 1, 0, 0, 1, 0, 0}, new long[] {1, 0, 0, 1, 0, 0, 2, 0, 1, 2, 0, 1, 4, 0, 2, 4, 1, 2, 6, 1, 4, 6, 2, 4, 10, 2, 6, 10, 4});
  }
}
