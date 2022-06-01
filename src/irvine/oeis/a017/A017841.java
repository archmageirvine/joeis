package irvine.oeis.a017;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A017841 Expansion of 1/(1-x^5-x^6-x^7-x^8-x^9-x^10).
 * @author Sean A. Irvine
 */
public class A017841 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017841() {
    super(new long[] {1, 1, 1, 1, 1, 1, 0, 0, 0, 0}, new long[] {1, 0, 0, 0, 0, 1, 1, 1, 1, 1});
  }
}
