package irvine.oeis.a017;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A017899 Expansion of 1/(1 -x^5 -x^6 -x^7 - ...).
 * @author Sean A. Irvine
 */
public class A017899 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017899() {
    super(new long[] {1, 0, 0, 0, 1}, new long[] {1, 0, 0, 0, 0});
  }
}
