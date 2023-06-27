package irvine.oeis.a259;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A259164 Positive heptagonal numbers (A000566) that are squares (A000290) divided by 2.
 * @author Sean A. Irvine
 */
public class A259164 extends LinearRecurrence {

  /** Construct the sequence. */
  public A259164() {
    super(1, new long[] {1, -103683, 103683}, new long[] {18, 1877922, 194706720450L});
  }
}
