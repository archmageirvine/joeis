package irvine.oeis.a147;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A147832 Numbers congruent (0,2) mod 14.
 * @author Sean A. Irvine
 */
public class A147832 extends LinearRecurrence {

  /** Construct the sequence. */
  public A147832() {
    super(1, new long[] {-1, 1, 1}, new long[] {0, 2, 14});
  }
}
