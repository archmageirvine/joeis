package irvine.oeis.a029;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A029197 Expansion of 1/((1-x^2)(1-x^5)(1-x^6)(1-x^11)).
 * @author Sean A. Irvine
 */
public class A029197 extends LinearRecurrence {

  /** Construct the sequence. */
  public A029197() {
    super(new long[] {-1, 0, 1, 0, 0, 1, 1, -1, -1, 0, 0, 0, 0, 0, 0, 0, -1, -1, 1, 1, 0, 0, 1, 0}, new long[] {1, 0, 1, 0, 1, 1, 2, 1, 2, 1, 3, 3, 4, 3, 4, 4, 6, 6, 7, 6, 8, 8, 11, 10});
  }
}
