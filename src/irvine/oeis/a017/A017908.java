package irvine.oeis.a017;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A017908 Expansion of 1/(1 - x^14 - x^15 - ...).
 * @author Sean A. Irvine
 */
public class A017908 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017908() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1}, new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0});
  }
}
