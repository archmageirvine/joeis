package irvine.oeis.a017;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A017885 Expansion of 1/(1-x^9-x^10-x^11-x^12-x^13-x^14-x^15-x^16-x^17-x^18).
 * @author Sean A. Irvine
 */
public class A017885 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017885() {
    super(new long[] {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1});
  }
}
