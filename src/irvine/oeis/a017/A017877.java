package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017877 Expansion of 1/(1 - x^9 - x^10).
 * @author Sean A. Irvine
 */
public class A017877 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017877() {
    super(new long[] {1, 1, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0, 1});
  }
}
