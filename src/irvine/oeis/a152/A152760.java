package irvine.oeis.a152;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A152760 4 times 9-gonal numbers: a(n) = 2*n*(7*n-5).
 * @author Sean A. Irvine
 */
public class A152760 extends LinearRecurrence {

  /** Construct the sequence. */
  public A152760() {
    super(new long[] {1, -3, 3}, new long[] {0, 4, 36});
  }
}
