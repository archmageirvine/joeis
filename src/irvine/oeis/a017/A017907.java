package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017907 Expansion of 1/(1 - x^13 - x^14 - ...).
 * @author Sean A. Irvine
 */
public class A017907 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017907() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1}, new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0});
  }
}
