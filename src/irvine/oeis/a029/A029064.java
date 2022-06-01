package irvine.oeis.a029;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A029064 Expansion of 1/((1-x)*(1-x^4)*(1-x^5)*(1-x^7)).
 * @author Sean A. Irvine
 */
public class A029064 extends LinearRecurrence {

  /** Construct the sequence. */
  public A029064() {
    super(new long[] {-1, 1, 0, 0, 1, 0, -1, 1, -1, -1, 1, -1, 0, 1, 0, 0, 1}, new long[] {1, 1, 1, 1, 2, 3, 3, 4, 5, 6, 7, 8, 10, 11, 13, 15, 17});
  }
}
