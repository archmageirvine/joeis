package irvine.oeis.a137;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A137935 a(n) = 5n + 26*floor(n/5).
 * @author Sean A. Irvine
 */
public class A137935 extends LinearRecurrence {

  /** Construct the sequence. */
  public A137935() {
    super(new long[] {-1, 1, 0, 0, 0, 1}, new long[] {0, 5, 10, 15, 20, 51});
  }
}
