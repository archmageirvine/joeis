package irvine.oeis.a152;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A152759 3 times 9-gonal (or nonagonal) numbers: a(n) = 3*n*(7*n-5)/2.
 * @author Sean A. Irvine
 */
public class A152759 extends LinearRecurrence {

  /** Construct the sequence. */
  public A152759() {
    super(new long[] {1, -3, 3}, new long[] {0, 3, 27});
  }
}
