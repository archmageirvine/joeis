package irvine.oeis.a017;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A017900 Expansion of 1/(1 -x^6 -x^7 -x^8 - ...).
 * @author Sean A. Irvine
 */
public class A017900 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017900() {
    super(new long[] {1, 0, 0, 0, 0, 1}, new long[] {1, 0, 0, 0, 0, 0});
  }
}
