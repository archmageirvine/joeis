package irvine.oeis.a108;

import irvine.oeis.LinearRecurrence;

/**
 * A108645 <code>a(n) = (n+1)(n+2)^2*(n+3)^2*(n+4)(2n^2 + 6n + 5)/720</code>.
 * @author Sean A. Irvine
 */
public class A108645 extends LinearRecurrence {

  /** Construct the sequence. */
  public A108645() {
    super(new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9}, new long[] {1, 26, 250, 1435, 5978, 19992, 56952, 143550, 328515});
  }
}
