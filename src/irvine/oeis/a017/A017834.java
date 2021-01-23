package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017834 Expansion of 1/(1-x^4-x^5-x^6-x^7-x^8-x^9-x^10-x^11-x^12).
 * @author Sean A. Irvine
 */
public class A017834 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017834() {
    super(new long[] {1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0}, new long[] {1, 0, 0, 0, 1, 1, 1, 1, 2, 3, 4, 5});
  }
}
