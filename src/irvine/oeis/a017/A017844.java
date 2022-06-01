package irvine.oeis.a017;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A017844 Expansion of 1/(1-x^5-x^6-x^7-x^8-x^9-x^10-x^11-x^12-x^13).
 * @author Sean A. Irvine
 */
public class A017844 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017844() {
    super(new long[] {1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0}, new long[] {1, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 3, 4});
  }
}
