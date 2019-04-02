package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017857 Expansion of 1/(1 - x^7 - x^8).
 * @author Sean A. Irvine
 */
public class A017857 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017857() {
    super(new long[] {1, 1, 0, 0, 0, 0, 0, 0}, new long[] {1, 0, 0, 0, 0, 0, 0, 1});
  }
}
