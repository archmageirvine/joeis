package irvine.oeis.a152;

import irvine.oeis.LinearRecurrence;

/**
 * A152730 a(n) + a(n+1) + a(n+2) = n^5, with a(1) = a(2) = 0.
 * @author Sean A. Irvine
 */
public class A152730 extends LinearRecurrence {

  /** Construct the sequence. */
  public A152730() {
    super(new long[] {-1, 5, -10, 11, -10, 11, -10, 5}, new long[] {0, 0, 1, 31, 211, 782, 2132, 4862});
  }
}
