package irvine.oeis.a147;

import irvine.oeis.LinearRecurrence;

/**
 * A147607.
 * @author Sean A. Irvine
 */
public class A147607 extends LinearRecurrence {

  /** Construct the sequence. */
  public A147607() {
    super(new long[] {-1, 0, 4, 0, -4, 0, -4, 0, 11, 0, -4, 0, -4, 0, 4, 0}, new long[] {1, 0, 4, 0, 12, 0, 28, 0, 59, 0, 116, 0, 228, 0, 460, 0});
  }
}
