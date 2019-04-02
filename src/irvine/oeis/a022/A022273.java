package irvine.oeis.a022;

import irvine.oeis.LinearRecurrence;

/**
 * A022273 a(n) = n*(15*n + 1)/2.
 * @author Sean A. Irvine
 */
public class A022273 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022273() {
    super(new long[] {1, -3, 3}, new long[] {0, 8, 31});
  }
}
