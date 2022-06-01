package irvine.oeis.a017;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A017905 Expansion of 1/(1 - x^11 - x^12 - ...).
 * @author Sean A. Irvine
 */
public class A017905 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017905() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1}, new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0});
  }
}
