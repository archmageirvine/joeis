package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017862 Expansion of 1/(1-x^7-x^8-x^9-x^10-x^11-x^12-x^13).
 * @author Sean A. Irvine
 */
public class A017862 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017862() {
    super(new long[] {1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0}, new long[] {1, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1});
  }
}
