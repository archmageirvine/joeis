package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017903 Expansion of 1/(1 - x^9 - x^10 - ...).
 * @author Sean A. Irvine
 */
public class A017903 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017903() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0, 1}, new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0});
  }
}
