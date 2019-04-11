package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017855 Expansion of <code>1/(1-x^6-x^7-x^8-x^9-x^10-x^11-x^12-x^13-x^14-x^15)</code>.
 * @author Sean A. Irvine
 */
public class A017855 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017855() {
    super(new long[] {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0}, new long[] {1, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 2, 3, 4});
  }
}
