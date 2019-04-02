package irvine.oeis.a029;

import irvine.oeis.LinearRecurrence;

/**
 * A029068 Expansion of 1/((1-x)*(1-x^4)*(1-x^5)*(1-x^11)).
 * @author Sean A. Irvine
 */
public class A029068 extends LinearRecurrence {

  /** Construct the sequence. */
  public A029068() {
    super(new long[] {-1, 1, 0, 0, 1, 0, -1, 0, 0, -1, 1, 1, -1, 0, 0, -1, 0, 1, 0, 0, 1}, new long[] {1, 1, 1, 1, 2, 3, 3, 3, 4, 5, 6, 7, 8, 9, 10, 12, 14, 15, 16, 18, 21});
  }
}
