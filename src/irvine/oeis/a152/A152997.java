package irvine.oeis.a152;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A152997 Twice 13-gonal numbers: a(n) = n*(11*n - 9).
 * @author Sean A. Irvine
 */
public class A152997 extends LinearRecurrence {

  /** Construct the sequence. */
  public A152997() {
    super(new long[] {1, -3, 3}, new long[] {0, 2, 26});
  }
}
