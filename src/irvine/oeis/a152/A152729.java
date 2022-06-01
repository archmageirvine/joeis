package irvine.oeis.a152;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A152729 a(n) = (n-2)^4 - a(n-1) - a(n-2), with a(1) = a(2) = 0.
 * @author Sean A. Irvine
 */
public class A152729 extends LinearRecurrence {

  /** Construct the sequence. */
  public A152729() {
    super(new long[] {1, -4, 6, -5, 5, -6, 4}, new long[] {0, 0, 1, 15, 65, 176, 384});
  }
}
