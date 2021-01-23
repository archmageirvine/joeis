package irvine.oeis.a029;

import irvine.oeis.LinearRecurrence;

/**
 * A029321 Expansion of 1/((1-x^3)(1-x^8)(1-x^11)(1-x^12)).
 * @author Sean A. Irvine
 */
public class A029321 extends LinearRecurrence {

  /** Construct the sequence. */
  public A029321() {
    super(new long[] {-1, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, -1, -1, 0, 0, 0, -1, -1, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0}, new long[] {1, 0, 0, 1, 0, 0, 1, 0, 1, 1, 0, 2, 2, 0, 2, 2, 1, 2, 2, 2, 3, 2, 3, 4, 4, 3, 4, 5, 4, 4, 6, 5, 6, 7});
  }
}
