package irvine.oeis.a147;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A147534 a(n) is congruent to (1,1,2) mod 3.
 * @author Sean A. Irvine
 */
public class A147534 extends LinearRecurrence {

  /** Construct the sequence. */
  public A147534() {
    super(1, new long[] {-1, 1, 0, 1}, new long[] {1, 1, 2, 4});
  }
}
