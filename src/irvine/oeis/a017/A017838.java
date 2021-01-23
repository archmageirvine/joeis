package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017838 Expansion of 1/(1-x^5-x^6-x^7).
 * @author Sean A. Irvine
 */
public class A017838 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017838() {
    super(new long[] {1, 1, 1, 0, 0, 0, 0}, new long[] {1, 0, 0, 0, 0, 1, 1});
  }
}
