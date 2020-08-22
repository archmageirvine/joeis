package irvine.oeis.a028;

import irvine.oeis.LinearRecurrence;

/**
 * A028294 a(n) = n^5 - (65/6)*n^4 + (173/6)*n^3 + (148/3)*n^2 - (862/3)*n + 265.
 * @author Sean A. Irvine
 */
public class A028294 extends LinearRecurrence {

  /** Construct the sequence. */
  public A028294() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {1, 20, 281, 1357, 4281, 10666});
  }
}
