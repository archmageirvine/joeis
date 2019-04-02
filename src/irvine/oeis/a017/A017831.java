package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017831 Expansion of 1/(1-x^4-x^5-x^6-x^7-x^8-x^9).
 * @author Sean A. Irvine
 */
public class A017831 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017831() {
    super(new long[] {1, 1, 1, 1, 1, 1, 0, 0, 0}, new long[] {1, 0, 0, 0, 1, 1, 1, 1, 2});
  }
}
