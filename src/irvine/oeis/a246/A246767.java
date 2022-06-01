package irvine.oeis.a246;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A246767 a(n) = n^4 - 2n.
 * @author Sean A. Irvine
 */
public class A246767 extends LinearRecurrence {

  /** Construct the sequence. */
  public A246767() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, -1, 12, 75, 248});
  }
}
