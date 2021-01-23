package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017906 Expansion of 1/(1 - x^12 - x^13 - ...).
 * @author Sean A. Irvine
 */
public class A017906 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017906() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1}, new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0});
  }
}
