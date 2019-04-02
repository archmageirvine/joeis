package irvine.oeis.a029;

import irvine.oeis.LinearRecurrence;

/**
 * A029148 Expansion of 1/((1-x^2)(1-x^3)(1-x^5)(1-x^11)).
 * @author Sean A. Irvine
 */
public class A029148 extends LinearRecurrence {

  /** Construct the sequence. */
  public A029148() {
    super(new long[] {-1, 0, 1, 1, 0, 0, 0, -1, -1, 0, 1, 1, 0, -1, -1, 0, 0, 0, 1, 1, 0}, new long[] {1, 0, 1, 1, 1, 2, 2, 2, 3, 3, 4, 5, 5, 6, 7, 8, 9, 10, 11, 12, 14});
  }
}
