package irvine.oeis.a147;

import irvine.oeis.LinearRecurrence;

/**
 * A147659.
 * @author Sean A. Irvine
 */
public class A147659 extends LinearRecurrence {

  /** Construct the sequence. */
  public A147659() {
    super(new long[] {-1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 1}, new long[] {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 90, 146});
  }
}
