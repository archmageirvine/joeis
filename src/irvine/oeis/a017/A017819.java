package irvine.oeis.a017;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A017819 Expansion of 1/(1-x^3-x^4-x^5-x^6).
 * @author Sean A. Irvine
 */
public class A017819 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017819() {
    super(new long[] {1, 1, 1, 1, 0, 0}, new long[] {1, 0, 0, 1, 1, 1});
  }
}
