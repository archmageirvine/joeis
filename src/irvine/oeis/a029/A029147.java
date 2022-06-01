package irvine.oeis.a029;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A029147 Expansion of 1/((1-x^2)(1-x^3)(1-x^5)(1-x^10)).
 * @author Sean A. Irvine
 */
public class A029147 extends LinearRecurrence {

  /** Construct the sequence. */
  public A029147() {
    super(new long[] {-1, 0, 1, 1, 0, 0, 0, -1, -1, 0, 2, 0, -1, -1, 0, 0, 0, 1, 1, 0}, new long[] {1, 0, 1, 1, 1, 2, 2, 2, 3, 3, 5, 4, 6, 6, 7, 9, 9, 10, 12, 12});
  }
}
