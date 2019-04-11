package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017830 Expansion of <code>1/(1-x^4-x^5-x^6-x^7-x^8)</code>.
 * @author Sean A. Irvine
 */
public class A017830 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017830() {
    super(new long[] {1, 1, 1, 1, 1, 0, 0, 0}, new long[] {1, 0, 0, 0, 1, 1, 1, 1});
  }
}
