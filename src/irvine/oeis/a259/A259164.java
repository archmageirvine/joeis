package irvine.oeis.a259;

import irvine.oeis.LinearRecurrence;

/**
 * A259164 Positive heptagonal numbers <code>(A000566)</code> that are squares <code>(A000290)</code> divided by 2.
 * @author Sean A. Irvine
 */
public class A259164 extends LinearRecurrence {

  /** Construct the sequence. */
  public A259164() {
    super(new long[] {1, -103683, 103683}, new long[] {18, 1877922, 194706720450L});
  }
}
