package irvine.oeis.a029;

import irvine.oeis.LinearRecurrence;

/**
 * A029035 Expansion of 1/((1-x)*(1-x^3)*(1-x^4)*(1-x^9)).
 * @author Sean A. Irvine
 */
public class A029035 extends LinearRecurrence {

  /** Construct the sequence. */
  public A029035() {
    super(new long[] {-1, 1, 0, 1, 0, -1, 0, -1, 1, 1, -1, 0, -1, 0, 1, 0, 1}, new long[] {1, 1, 1, 2, 3, 3, 4, 5, 6, 8, 9, 10, 13, 15, 16, 19, 22});
  }
}
