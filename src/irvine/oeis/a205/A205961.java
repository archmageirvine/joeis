package irvine.oeis.a205;

import irvine.oeis.LinearRecurrence;

/**
 * A205961 Expansion of 1/(-32*x^5 + 8*x^3 - 4*x^2 - x + 1).
 * @author Sean A. Irvine
 */
public class A205961 extends LinearRecurrence {

  /** Construct the sequence. */
  public A205961() {
    super(new long[] {32, 0, -8, 4, 1}, new long[] {1, 1, 5, 1, 13});
  }
}
