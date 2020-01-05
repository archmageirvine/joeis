package irvine.oeis.a028;

import irvine.oeis.LinearRecurrence;

/**
 * A028344 Molien series for complete weight enumerator of self-dual code over <code>GF(5)</code>.
 * @author Sean A. Irvine
 */
public class A028344 extends LinearRecurrence {

  /** Construct the sequence. */
  public A028344() {
    super(new long[] {1, 0, -1, -2, 0, 0, 1, 2, 3, 0, -3, -2, -1, 0, 0, 2, 1, 0},
      new long[] {1, 1, 1, 3, 4, 9, 19, 27, 41, 62, 91, 128, 175, 231, 298, 392, 498, 617});
  }
}
